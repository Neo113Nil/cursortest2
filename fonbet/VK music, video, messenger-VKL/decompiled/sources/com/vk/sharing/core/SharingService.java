package com.vk.sharing.core;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.log.L;
import com.vk.sharing.api.di.SharingScopedComponent;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.RepostAttachmentInfo;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.api.dto.WallRepostSettings;
import com.vk.stat.scheme.SchemeStat$TypeShareItem;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.EmptyList;
import xsna.cuz;
import xsna.cvk;
import xsna.dcj0;
import xsna.e43;
import xsna.fpf0;
import xsna.j03;
import xsna.j6i;
import xsna.k7m;
import xsna.kbj0;
import xsna.m7m;
import xsna.nax0;
import xsna.nr4;
import xsna.o2i;
import xsna.ozg0;
import xsna.w8i;
import xsna.y501;
import xsna.z74;

/* loaded from: classes5.dex */
public final class SharingService extends IntentService implements w8i {
    public SharedPreferences b;
    public b c;

    public static abstract class a {
        public boolean a = true;
        public int b;

        @NonNull
        public final cuz c;

        public a(@NonNull cuz cuzVar) {
            this.c = cuzVar;
        }

        public abstract void a(Throwable th);

        public abstract c b(@NonNull Intent intent);

        public abstract void c(c cVar);
    }

    public static final class b {

        @NonNull
        public final Peer a;
        public final int b;
        public int c;
        public int d;
        public int e;
        public Throwable f;

        public b(int i, int i2, @Nullable Peer peer, @NonNull String str) {
            if (peer == null) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                peer = Peer.Unknown.e;
            }
            this.a = peer;
            this.c = i;
            this.b = i2;
            this.d = i2;
            this.e = 0;
        }
    }

    public static class c {
        public boolean a;
        public UserId d;
        public long c = -1;
        public Throwable b = null;

        public c(boolean z) {
            this.a = z;
        }
    }

    public static final class d extends a {
        public long d;
        public String e;

        @NonNull
        public final dcj0 f;

        public d(cuz cuzVar, @NonNull dcj0 dcj0Var) {
            super(cuzVar);
            this.d = 0L;
            this.e = "unknown";
            this.f = dcj0Var;
        }

        @Override // com.vk.sharing.core.SharingService.a
        public final void a(Throwable th) {
            cvk.w(j03.g(e43.a, th, R.string.sharing_job_call_message_toast_fail), false);
            UserId userId = new UserId(this.d);
            Intent intent = new Intent("com.vkontakte.android.ACTION_SHARING_ERROR_STATUS");
            intent.putExtra("userId", userId);
            this.c.c(intent);
        }

        @Override // com.vk.sharing.core.SharingService.a
        public final c b(@NonNull Intent intent) {
            String n;
            String str;
            Attachment attachment;
            AttachmentInfo attachmentInfo = (AttachmentInfo) intent.getParcelableExtra("attachment_info");
            this.d = intent.getLongExtra("dialog_id", 0L);
            String stringExtra = intent.getStringExtra("text");
            String stringExtra2 = intent.getStringExtra("referer");
            String stringExtra3 = intent.getStringExtra("referer_src");
            int i = attachmentInfo != null ? attachmentInfo.b : 0;
            Attachment attachment2 = attachmentInfo != null ? (Attachment) attachmentInfo.f.getParcelable("attachments") : null;
            String string = attachmentInfo != null ? attachmentInfo.f.getString("trackCode") : null;
            this.a = intent.getBooleanExtra("showToastOnSuccess", true);
            this.b = intent.getIntExtra("extra_sharing_success_request_code", -1);
            this.e = intent.getStringExtra("entryPoint");
            if (this.d == 0) {
                return new c(false);
            }
            if (i == 3 && attachmentInfo.c == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(z74.n(attachmentInfo));
                if (!TextUtils.isEmpty(stringExtra)) {
                    sb.append('\n');
                    sb.append(stringExtra);
                }
                str = sb.toString();
                n = null;
            } else {
                n = z74.n(attachmentInfo);
                str = stringExtra;
                if (attachment2 instanceof AlbumAttachment) {
                    attachment = null;
                    this.f.e(this.d);
                    return new c(this.f.f("SharingService", this.d, str, n, attachment, string, stringExtra2, stringExtra3));
                }
            }
            attachment = attachment2;
            this.f.e(this.d);
            return new c(this.f.f("SharingService", this.d, str, n, attachment, string, stringExtra2, stringExtra3));
        }

        @Override // com.vk.sharing.core.SharingService.a
        public final void c(c cVar) {
            if (this.a) {
                cvk.u(R.string.sharing_job_call_message_toast_success, false);
            }
            String str = this.e;
            str.getClass();
            SchemeStat$TypeShareItem.ShareType shareType = !str.equals("share") ? !str.equals("share_create_chat") ? null : SchemeStat$TypeShareItem.ShareType.CREATE_CHAT : SchemeStat$TypeShareItem.ShareType.MESSAGE;
            if (shareType != null) {
                nr4.b().d(new kbj0.a(this.b, shareType, Long.valueOf(this.d)));
            }
        }
    }

    public static final class e extends f {
    }

    public static class f extends a {
        public final o2i d;
        public Intent e;

        public f(cuz cuzVar, o2i o2iVar) {
            super(cuzVar);
            this.d = o2iVar;
        }

        public static c d(nax0 nax0Var) {
            if (!(nax0Var instanceof nax0.b)) {
                Throwable th = ((nax0.a) nax0Var).a;
                c cVar = new c();
                cVar.c = -1L;
                cVar.a = false;
                cVar.b = th;
                return cVar;
            }
            nax0.b bVar = (nax0.b) nax0Var;
            long j = bVar.a;
            UserId userId = bVar.b;
            c cVar2 = new c();
            cVar2.c = j;
            cVar2.d = userId;
            cVar2.a = true;
            cVar2.b = null;
            return cVar2;
        }

        @Override // com.vk.sharing.core.SharingService.a
        public final void a(Throwable th) {
            UserId userId;
            if (th == null) {
                com.vk.metrics.eventtracking.b.a.q(new Throwable("Error is null in sharing_job_call_repost_toast_fail"));
                return;
            }
            if (!this.d.d(th, true)) {
                cvk.w(j03.g(e43.a, th, R.string.sharing_job_call_repost_toast_fail), false);
            }
            Target target = (Target) this.e.getParcelableExtra("target");
            if (target == null) {
                new IllegalArgumentException("JobHandler: target is null").printStackTrace();
                userId = UserId.d;
            } else {
                userId = target.c;
            }
            Intent intent = new Intent("com.vkontakte.android.ACTION_SHARING_ERROR_STATUS");
            intent.putExtra("userId", userId);
            this.c.c(intent);
        }

        @Override // com.vk.sharing.core.SharingService.a
        public final c b(@NonNull Intent intent) {
            UserId userId;
            c d;
            String str;
            RepostAttachmentInfo repostAttachmentInfo;
            RepostAttachmentInfo repostAttachmentInfo2 = (RepostAttachmentInfo) intent.getParcelableExtra("repost_attachment_info");
            String stringExtra = intent.getStringExtra("text");
            if (repostAttachmentInfo2 == null && TextUtils.isEmpty(stringExtra)) {
                return new c(false);
            }
            String stringExtra2 = intent.getStringExtra("referer");
            String stringExtra3 = intent.getStringExtra("ref");
            String str2 = repostAttachmentInfo2 != null ? repostAttachmentInfo2.k : null;
            int i = repostAttachmentInfo2 != null ? repostAttachmentInfo2.b : 0;
            WallRepostSettings wallRepostSettings = intent.hasExtra("settings") ? (WallRepostSettings) intent.getParcelableExtra("settings") : null;
            this.a = intent.getBooleanExtra("showToastOnSuccess", true);
            this.b = intent.getIntExtra("extra_sharing_success_request_code", -1);
            Target target = (Target) intent.getParcelableExtra("target");
            if (target == null) {
                new IllegalArgumentException("JobHandler: target is null").printStackTrace();
                userId = UserId.d;
            } else {
                userId = target.c;
            }
            if (i == 19 || i == 3 || i == 4 || i == 34 || i == 5 || i == 8 || i == 21 || i == 11 || i == 24 || i == 15 || i == 40 || i == 0) {
                String str3 = str2;
                UserId userId2 = userId;
                this.e = intent;
                boolean z = !(this instanceof e);
                d = d(y501.a().e(userId2, repostAttachmentInfo2, wallRepostSettings, stringExtra, str3, stringExtra3, z, z));
            } else if (i == 39 || i == 41) {
                String str4 = str2;
                UserId userId3 = userId;
                int i2 = repostAttachmentInfo2.b;
                if (i2 == 39 || i2 == 41) {
                    Parcelable t = ozg0.a().t(userId3, repostAttachmentInfo2.m);
                    if (t instanceof PhotoAttachment) {
                        Photo photo = ((PhotoAttachment) t).l;
                        str = str4;
                        repostAttachmentInfo = new RepostAttachmentInfo(18, photo.e.b, photo.c, photo.v, null, null, null, null, false, null, EmptyList.b, null);
                        this.e = intent;
                        d = d(y501.a().e(userId3, repostAttachmentInfo, wallRepostSettings, stringExtra, str, null, !(this instanceof e), false));
                    }
                }
                str = str4;
                repostAttachmentInfo = repostAttachmentInfo2;
                this.e = intent;
                d = d(y501.a().e(userId3, repostAttachmentInfo, wallRepostSettings, stringExtra, str, null, !(this instanceof e), false));
            } else {
                this.e = intent;
                boolean z2 = !(this instanceof e);
                d = d(y501.a().k(userId, repostAttachmentInfo2, wallRepostSettings, stringExtra, stringExtra2, str2, z2, z2));
            }
            if (d.a && 32 == i) {
                List<DeprecatedStatisticInterface> list = repostAttachmentInfo2 != null ? repostAttachmentInfo2.l : null;
                if (list != null) {
                    Iterator<DeprecatedStatisticInterface> it = list.iterator();
                    while (it.hasNext()) {
                        com.vkontakte.android.data.b.o(it.next(), "share_post");
                    }
                }
            }
            return d;
        }

        @Override // com.vk.sharing.core.SharingService.a
        public final void c(c cVar) {
            if (this.a) {
                cvk.u(R.string.sharing_job_call_repost_toast_success, false);
            }
            if (this instanceof e) {
                nr4.b().d(new kbj0.a(this.b, SchemeStat$TypeShareItem.ShareType.COMMUNITY_WALL, Long.valueOf(cVar.c), cVar.d));
            } else {
                nr4.b().d(new kbj0.a(this.b, SchemeStat$TypeShareItem.ShareType.OWN_WALL, Long.valueOf(cVar.c), cVar.d));
            }
        }
    }

    public SharingService() {
        super("Sharing");
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = Preference.h(this, 0, "sharing_service");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@Nullable Intent intent) {
        a dVar;
        b bVar;
        if (intent == null) {
            L.G("Intent is null");
            return;
        }
        if (this.c == null) {
            String string = this.b.getString("job_id", null);
            Peer peer = (Peer) intent.getParcelableExtra("owner_id");
            if (string == null) {
                String uuid = UUID.randomUUID().toString();
                bVar = new b(intent.getIntExtra(NotificationCompat.CATEGORY_CALL, 0), intent.getIntExtra("total_targets", 1), peer, uuid);
                this.b.edit().putString("job_id", uuid).putInt("job_type", bVar.c).putInt("job_total", bVar.b).putInt("job_current", bVar.d).putInt("job_failures", bVar.e).apply();
            } else {
                bVar = new b(this.b.getInt("job_type", 0), this.b.getInt("job_total", 1), peer, string);
            }
            this.c = bVar;
        }
        b bVar2 = this.c;
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_CALL, 0);
        if (bVar2.c != intExtra) {
            this.b.edit().putInt("job_type", intExtra).apply();
            bVar2.c = intExtra;
        }
        b bVar3 = this.c;
        int i = bVar3.c;
        if (i == 1) {
            cuz a2 = cuz.a(this);
            Peer peer2 = bVar3.a;
            k7m k7mVar = (k7m) m7m.f(this);
            dVar = new d(a2, ((SharingScopedComponent) k7mVar.d(((ImFeatureScopeProviderComponent) k7mVar.a(fpf0.a(ImFeatureScopeProviderComponent.class))).getProvider().a(peer2)).a(fpf0.a(SharingScopedComponent.class))).c());
        } else if (i == 2) {
            dVar = new f(cuz.a(this), ((CommunityStrikesComponent) j6i.b(m7m.f(this), CommunityStrikesComponent.class)).ge());
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Unknown type: " + bVar3.c);
            }
            dVar = new e(cuz.a(this), ((CommunityStrikesComponent) j6i.b(m7m.f(this), CommunityStrikesComponent.class)).ge());
        }
        c b2 = dVar.b(intent);
        b bVar4 = this.c;
        bVar4.d--;
        if (!b2.a) {
            Throwable th = b2.b;
            if (bVar4.f == null) {
                bVar4.f = th;
            }
            bVar4.e++;
        }
        SharedPreferences.Editor edit = this.b.edit();
        b bVar5 = this.c;
        int i2 = bVar5.d;
        if (i2 == 0) {
            if (bVar5.e != bVar5.b) {
                dVar.c(b2);
            } else {
                dVar.a(bVar5.f);
            }
            this.c = null;
            edit.remove("job_id");
        } else {
            edit.putInt("job_current", i2).putInt("job_failures", this.c.e);
        }
        edit.apply();
    }
}

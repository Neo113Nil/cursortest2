package com.vk.clips.coauthors.invite;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.clips.coauthors.invite.CoauthorsInviteDialog;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.toggle.b;
import com.vk.toggle.d;
import com.vk.toggle.features.ClipsFeatures;
import com.vkontakte.android.R;
import defpackage.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.commons.http.Http;
import xsna.asp;
import xsna.eeu0;
import xsna.fkq0;
import xsna.h7u0;
import xsna.i70;
import xsna.inc;
import xsna.j70;
import xsna.msy;
import xsna.w8i;
import xsna.wyf;
import xsna.zrp;

/* compiled from: CoauthorsInviteDialog.kt */
/* loaded from: classes16.dex */
public final class CoauthorsInviteDialog implements w8i {
    public final ClipVideoFile b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final eeu0.a f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CoauthorsInviteDialog.kt */
    public static final class Item {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Item[] $VALUES;
        public static final Item Accept;
        public static final Item ChangePrivacy;
        public static final Item Decline;
        private final int text;

        static {
            Item item = new Item(Http.Header.ACCEPT, 0, R.string.clips_coauthors_accept_invite);
            Accept = item;
            Item item2 = new Item("Decline", 1, R.string.clips_coauthors_decline_invite);
            Decline = item2;
            Item item3 = new Item("ChangePrivacy", 2, R.string.clips_coauthors_change_privacy);
            ChangePrivacy = item3;
            Item[] itemArr = {item, item2, item3};
            $VALUES = itemArr;
            $ENTRIES = new asp(itemArr);
        }

        public Item(String str, int i, int i2) {
            this.text = i2;
        }

        public static Item valueOf(String str) {
            return (Item) Enum.valueOf(Item.class, str);
        }

        public static Item[] values() {
            return (Item[]) $VALUES.clone();
        }

        public final int h() {
            return this.text;
        }
    }

    public CoauthorsInviteDialog(final Context context, ClipVideoFile clipVideoFile) {
        int i;
        this.b = clipVideoFile;
        k kVar = new k(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, kVar);
        this.d = msy.a(lazyThreadSafetyMode, new i70(this, 26));
        this.e = msy.a(lazyThreadSafetyMode, new j70(this, 28));
        eeu0.a aVar = d.R() ? new h7u0.a(context, R.style.VkCoauthorRequestDialogTheme, null, 4) : new eeu0.a(context, R.style.VkCoauthorRequestDialogTheme);
        this.f = aVar;
        ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
        clipsFeatures.getClass();
        b bVar = b.A;
        boolean a = bVar.a(clipsFeatures);
        int i2 = R.string.clips_coauthors_invite_subtitle_profile;
        if (a && BuildInfo.q()) {
            i2 = fkq0.b(clipVideoFile.b) ? R.string.clips_coauthors_invite_subtitle_channel : i2;
            i = R.string.clips_coauthors_invite_title_redesign;
        } else {
            i = R.string.clips_coauthors_invite_title;
        }
        eeu0.a negativeButton = aVar.B(i).q(i2).setPositiveButton(Item.Accept.h(), new DialogInterface.OnClickListener() { // from class: xsna.uyf
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                CoauthorsInviteDialog coauthorsInviteDialog = CoauthorsInviteDialog.this;
                ClipVideoFile clipVideoFile2 = coauthorsInviteDialog.b;
                List<CoOwnerItem> list = clipVideoFile2.N1;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    CoOwnerItem coOwnerItem = (CoOwnerItem) obj;
                    if (coOwnerItem.e && coOwnerItem.c == CoOwnerItem.StatusDto.PENDING) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == 1) {
                    ver0.a(hg1.h(((qmd) coauthorsInviteDialog.e.getValue()).b(clipVideoFile2.c, clipVideoFile2.b, Collections.singletonList(((CoOwnerItem) j5g.Y(arrayList)).b), true).t(new do3(new il7(2, coauthorsInviteDialog, (CoOwnerItem) j5g.Y(arrayList)), 8)).a0(asu0.a.d()).F(new defpackage.x(new d40(14), 13)), new wje(coauthorsInviteDialog, 3)));
                } else {
                    new inc.a(context, clipVideoFile2, ClipCoauthorsDecisionLaunchType.AcceptRequest.b).I0("ClipCoauthorPendingRequestsBottomSheet");
                }
            }
        }).setNegativeButton(Item.Decline.h(), new DialogInterface.OnClickListener() { // from class: xsna.vyf
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                CoauthorsInviteDialog coauthorsInviteDialog = CoauthorsInviteDialog.this;
                ClipVideoFile clipVideoFile2 = coauthorsInviteDialog.b;
                List<CoOwnerItem> list = clipVideoFile2.N1;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    CoOwnerItem coOwnerItem = (CoOwnerItem) obj;
                    if (coOwnerItem.e && coOwnerItem.c == CoOwnerItem.StatusDto.PENDING) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == 1) {
                    ver0.a(hg1.h(((qmd) coauthorsInviteDialog.e.getValue()).b(clipVideoFile2.c, clipVideoFile2.b, Collections.singletonList(((CoOwnerItem) j5g.Y(arrayList)).b), false).a0(asu0.a.d()).F(new defpackage.n(new y8(12), 16)), new defpackage.o(14, coauthorsInviteDialog, arrayList)));
                } else {
                    new inc.a(context, clipVideoFile2, ClipCoauthorsDecisionLaunchType.DeclineRequest.b).I0("ClipCoauthorPendingRequestsBottomSheet");
                }
            }
        });
        if (BuildInfo.s() || !bVar.a(clipsFeatures)) {
            negativeButton.v(Item.ChangePrivacy.h(), new wyf(0, this, context));
        }
    }
}

package com.vk.newsfeed.posting.mentions.data;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.movika.sdk.base.flow.binding.c;
import com.vk.newsfeed.posting.mentions.data.MentionRepository;
import com.vk.newsfeed.posting.mentions.model.PostMentionProfile;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.Iterator;
import java.util.List;
import xsna.e420;
import xsna.epx;
import xsna.iwg0;
import xsna.kwg0;
import xsna.wmi0;

/* compiled from: MentionRepository.kt */
/* loaded from: classes4.dex */
public final class MentionRepository {
    public static void a(final PostMentionProfile postMentionProfile) {
        j1 U = wmi0.a.e("postMentionProfiles").U(new c(new e420(0), 21));
        f fVar = new f() { // from class: com.vk.newsfeed.posting.mentions.data.b
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                List list = (List) obj;
                PostMentionProfile postMentionProfile2 = PostMentionProfile.this;
                MentionRepository.CachedPostMentionProfile cachedPostMentionProfile = new MentionRepository.CachedPostMentionProfile(postMentionProfile2);
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (epx.f(((MentionRepository.CachedPostMentionProfile) it.next()).b, postMentionProfile2.b)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i > -1) {
                    list.set(i, cachedPostMentionProfile);
                } else {
                    list.add(cachedPostMentionProfile);
                }
                try {
                    wmi0.a.m("postMentionProfiles", list);
                } catch (Exception e) {
                    L.i(e);
                }
            }
        };
        int i = kwg0.a;
        U.subscribe(fVar, new iwg0());
    }

    /* compiled from: MentionRepository.kt */
    public static final class CachedPostMentionProfile extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<CachedPostMentionProfile> CREATOR = new a();
        public final UserId b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<CachedPostMentionProfile> {
            @Override // com.vk.core.serialize.Serializer.c
            public final CachedPostMentionProfile a(Serializer serializer) {
                String str;
                String str2;
                String str3;
                UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                String H2 = serializer.H();
                if (H2 == null) {
                    H2 = "";
                }
                String H3 = serializer.H();
                if (H3 == null) {
                    H3 = "";
                }
                String H4 = serializer.H();
                if (H4 == null) {
                    String str4 = H3;
                    str3 = "";
                    str = H2;
                    str2 = str4;
                } else {
                    str = H2;
                    str2 = H3;
                    str3 = H4;
                }
                return new CachedPostMentionProfile(userId, H, str, str2, str3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CachedPostMentionProfile[i];
            }
        }

        public CachedPostMentionProfile(PostMentionProfile postMentionProfile) {
            this(postMentionProfile.b, postMentionProfile.c, postMentionProfile.d, postMentionProfile.e, postMentionProfile.f);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            serializer.j0(this.f);
        }

        public CachedPostMentionProfile(UserId userId, String str, String str2, String str3, String str4) {
            this.b = userId;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }
    }
}

package com.vk.profile.community.newsfeed.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.a5i;
import xsna.abh;
import xsna.ych;

/* compiled from: CommunityNewsfeedComponent.kt */
/* loaded from: classes5.dex */
public interface CommunityNewsfeedComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: CommunityNewsfeedComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CommunityNewsfeedComponent STUB = new CommunityNewsfeedComponent() { // from class: com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent$Companion$STUB$1
            @Override // com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent
            public final ych Jb() {
                return ych.a.getSTUB();
            }

            @Override // com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent
            public final abh Q3() {
                return abh.a.a.getSTUB();
            }

            @Override // com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent
            public final a5i ba() {
                return a5i.a.getSTUB();
            }
        };

        public final CommunityNewsfeedComponent getSTUB() {
            return STUB;
        }
    }

    ych Jb();

    abh Q3();

    a5i ba();
}

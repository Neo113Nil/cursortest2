package com.vk.profile.community.members.api;

import androidx.fragment.app.Fragment;
import com.vk.di.component.DiUnscopedComponent;

/* compiled from: CommunityMembersComponent.kt */
/* loaded from: classes5.dex */
public interface CommunityMembersComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: CommunityMembersComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CommunityMembersComponent$Companion$STUB$1 STUB = new CommunityMembersComponent() { // from class: com.vk.profile.community.members.api.CommunityMembersComponent$Companion$STUB$1
            @Override // com.vk.profile.community.members.api.CommunityMembersComponent
            public final Fragment x1(long j, CommunityMembersFilter communityMembersFilter) {
                return new Fragment();
            }
        };
    }

    Fragment x1(long j, CommunityMembersFilter communityMembersFilter);
}

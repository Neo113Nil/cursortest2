package com.vk.profile.community.creationonboarding.impl.finish.presentation.feature;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.lj50;

/* compiled from: CommunityCreationOnboardingFinishAction.kt */
/* loaded from: classes5.dex */
public interface a extends lj50 {

    /* compiled from: CommunityCreationOnboardingFinishAction.kt */
    /* renamed from: com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a$a, reason: collision with other inner class name */
    public static final class C1551a implements a {
        public static final C1551a b = new C1551a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1551a);
        }

        public final int hashCode() {
            return 923600372;
        }

        public final String toString() {
            return "OnButtonClick";
        }
    }

    /* compiled from: CommunityCreationOnboardingFinishAction.kt */
    public static final class b implements a {
        public final UserId b;

        public b(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnCommunityClick(groupId="), this.b, ')');
        }
    }
}

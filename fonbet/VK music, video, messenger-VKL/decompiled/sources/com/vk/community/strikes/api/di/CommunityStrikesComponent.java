package com.vk.community.strikes.api.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import xsna.o2i;
import xsna.pwj0;
import xsna.u2i;

/* compiled from: CommunityStrikesComponent.kt */
/* loaded from: classes17.dex */
public interface CommunityStrikesComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: CommunityStrikesComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CommunityStrikesComponent STUB = new CommunityStrikesComponent() { // from class: com.vk.community.strikes.api.di.CommunityStrikesComponent$Companion$STUB$1
            public final a a = new a();

            /* compiled from: CommunityStrikesComponent.kt */
            public static final class a implements o2i {
                @Override // xsna.o2i
                public final boolean a(Throwable th) {
                    return false;
                }

                @Override // xsna.o2i
                public final boolean b(Context context, UserId userId, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType strikeRestrictionType) {
                    return false;
                }

                @Override // xsna.o2i
                public final boolean d(Throwable th, boolean z) {
                    return false;
                }
            }

            @Override // com.vk.community.strikes.api.di.CommunityStrikesComponent
            public final o2i ge() {
                return this.a;
            }

            /* compiled from: CommunityStrikesComponent.kt */
            public static final class b implements u2i {
                @Override // xsna.u2i
                public final void a(Context context, String str, String str2) {
                }
            }
        };

        public final CommunityStrikesComponent getSTUB() {
            return STUB;
        }
    }

    o2i ge();
}

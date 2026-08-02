package com.vk.video.profile.presentation.views;

import com.vkontakte.android.R;
import xsna.vu5;

/* compiled from: TextWithBages.kt */
/* loaded from: classes6.dex */
public interface a {

    /* compiled from: TextWithBages.kt */
    /* renamed from: com.vk.video.profile.presentation.views.a$a, reason: collision with other inner class name */
    public static final class C1964a implements a {
        @Override // com.vk.video.profile.presentation.views.a
        public final int a() {
            return R.string.vk_video_profile_a_plus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1964a)) {
                return false;
            }
            ((C1964a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.vk_video_profile_a_plus);
        }

        public final String toString() {
            return "APlusBadge(textRes=2131968088)";
        }
    }

    /* compiled from: TextWithBages.kt */
    public static final class b implements a {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        @Override // com.vk.video.profile.presentation.views.a
        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("AgeBadge(textRes="), this.a, ')');
        }
    }

    int a();
}

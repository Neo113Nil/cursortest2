package com.vk.profile.user.impl.domain.edit.models;

import android.graphics.RectF;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.ikv0;
import xsna.zrp;

/* compiled from: ExternalEvent.kt */
/* loaded from: classes5.dex */
public interface ExternalEvent {

    /* compiled from: ExternalEvent.kt */
    public static final class a implements ExternalEvent {
    }

    /* compiled from: ExternalEvent.kt */
    public interface b extends ExternalEvent {

        /* compiled from: ExternalEvent.kt */
        public static final class a implements b {
        }

        /* compiled from: ExternalEvent.kt */
        /* renamed from: com.vk.profile.user.impl.domain.edit.models.ExternalEvent$b$b, reason: collision with other inner class name */
        public static final class C1672b implements b {
            public final UserProfile a;

            public C1672b(UserProfile userProfile) {
                this.a = userProfile;
            }
        }

        /* compiled from: ExternalEvent.kt */
        public static final class c implements b {
            public final String a;
            public final RectF b;

            public c() {
                this(null, null);
            }

            public c(RectF rectF, String str) {
                this.a = str;
                this.b = rectF;
            }
        }

        /* compiled from: ExternalEvent.kt */
        public static final class d implements b {
            public final String a;

            public d(String str) {
                this.a = str;
            }
        }

        /* compiled from: ExternalEvent.kt */
        public static final class e implements b {
            public final ProfileSettingType a;

            public e(ProfileSettingType profileSettingType) {
                this.a = profileSettingType;
            }
        }

        /* compiled from: ExternalEvent.kt */
        public static final class f implements b {
            public final String a;

            public f(String str) {
                this.a = str;
            }
        }

        /* compiled from: ExternalEvent.kt */
        public static final class g implements b {
            public static final g a = new g();
        }
    }

    /* compiled from: ExternalEvent.kt */
    public static final class ShowSnackbar implements ExternalEvent {
        public final ShowType a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ExternalEvent.kt */
        public static final class ShowType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ShowType[] $VALUES;
            public static final ShowType None;
            public static final ShowType ViewGroup;
            public static final ShowType Window;

            static {
                ShowType showType = new ShowType("Window", 0);
                Window = showType;
                ShowType showType2 = new ShowType("ViewGroup", 1);
                ViewGroup = showType2;
                ShowType showType3 = new ShowType("None", 2);
                None = showType3;
                ShowType[] showTypeArr = {showType, showType2, showType3};
                $VALUES = showTypeArr;
                $ENTRIES = new asp(showTypeArr);
            }

            public ShowType() {
                throw null;
            }

            public static ShowType valueOf(String str) {
                return (ShowType) Enum.valueOf(ShowType.class, str);
            }

            public static ShowType[] values() {
                return (ShowType[]) $VALUES.clone();
            }
        }

        public ShowSnackbar(ShowType showType, int i, int i2, int i3) {
            this.a = showType;
            this.b = i;
            this.c = R.attr.vk_legacy_accent;
            this.d = i2;
            this.e = i3;
        }

        public ShowSnackbar(ShowType showType, int i, int i2, int i3, int i4) {
            this((i3 & 1) != 0 ? ShowType.None : showType, i, i2, ikv0.e);
        }
    }
}

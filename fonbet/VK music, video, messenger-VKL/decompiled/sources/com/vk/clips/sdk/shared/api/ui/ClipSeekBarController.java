package com.vk.clips.sdk.shared.api.ui;

import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.clips.sdk.shared.api.deps.SdkTimelineThumbs;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.h5s;
import xsna.shy;
import xsna.zrp;

/* compiled from: ClipSeekBarController.kt */
/* loaded from: classes17.dex */
public interface ClipSeekBarController {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipSeekBarController.kt */
    public static final class SeekBarVisibilityPermission {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SeekBarVisibilityPermission[] $VALUES;
        public static final SeekBarVisibilityPermission ALLOWED_TOGGLE;
        public static final SeekBarVisibilityPermission DISABLED_TOGGLE;

        static {
            SeekBarVisibilityPermission seekBarVisibilityPermission = new SeekBarVisibilityPermission("DISABLED_TOGGLE", 0);
            DISABLED_TOGGLE = seekBarVisibilityPermission;
            SeekBarVisibilityPermission seekBarVisibilityPermission2 = new SeekBarVisibilityPermission("ALLOWED_TOGGLE", 1);
            ALLOWED_TOGGLE = seekBarVisibilityPermission2;
            SeekBarVisibilityPermission[] seekBarVisibilityPermissionArr = {seekBarVisibilityPermission, seekBarVisibilityPermission2};
            $VALUES = seekBarVisibilityPermissionArr;
            $ENTRIES = new asp(seekBarVisibilityPermissionArr);
        }

        public SeekBarVisibilityPermission() {
            throw null;
        }

        public static SeekBarVisibilityPermission valueOf(String str) {
            return (SeekBarVisibilityPermission) Enum.valueOf(SeekBarVisibilityPermission.class, str);
        }

        public static SeekBarVisibilityPermission[] values() {
            return (SeekBarVisibilityPermission[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipSeekBarController.kt */
    public interface a {
        void a(float f, boolean z);

        void b(float f);

        void c();
    }

    /* compiled from: ClipSeekBarController.kt */
    public static final class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.a == bVar.a;
        }

        public final int hashCode() {
            return Integer.hashCode(R.color.vk_white) + shy.a(this.a, Integer.hashCode(android.R.color.transparent) * 31, 31);
        }

        public final String toString() {
            return h5s.c(this.a, ", thumbColor=2131101314)", new StringBuilder("SeekBarStyle(inactiveColor=17170445, activeColor="));
        }
    }

    void a(boolean z);

    void b();

    void c(SeekBarVisibilityPermission seekBarVisibilityPermission);

    void d(b bVar);

    void e(float f);

    float f();

    void g(a aVar);

    ClipSeekBarView getView();

    void h(a aVar);

    void i();

    SeekBarVisibilityPermission j();

    void k(SdkTimelineThumbs sdkTimelineThumbs);

    void l(int i);

    void m();
}

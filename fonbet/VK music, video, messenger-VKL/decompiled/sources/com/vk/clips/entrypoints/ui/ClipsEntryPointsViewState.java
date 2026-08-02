package com.vk.clips.entrypoints.ui;

import com.vk.clips.entrypoints.feature.ClipsEntryPointsState;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.List;
import xsna.ao50;
import xsna.asp;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.yzt0;
import xsna.zrp;

/* compiled from: ClipsEntryPointsViewState.kt */
/* loaded from: classes16.dex */
public final class ClipsEntryPointsViewState implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsEntryPointsViewState.kt */
    public static final class UIScreenMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UIScreenMode[] $VALUES;
        public static final UIScreenMode DRAFTS;
        public static final UIScreenMode PHOTO_PICKER;
        public static final UIScreenMode TEMPLATES;
        public static final UIScreenMode TRENDS;

        static {
            UIScreenMode uIScreenMode = new UIScreenMode("PHOTO_PICKER", 0);
            PHOTO_PICKER = uIScreenMode;
            UIScreenMode uIScreenMode2 = new UIScreenMode("DRAFTS", 1);
            DRAFTS = uIScreenMode2;
            UIScreenMode uIScreenMode3 = new UIScreenMode("TEMPLATES", 2);
            TEMPLATES = uIScreenMode3;
            UIScreenMode uIScreenMode4 = new UIScreenMode("TRENDS", 3);
            TRENDS = uIScreenMode4;
            UIScreenMode[] uIScreenModeArr = {uIScreenMode, uIScreenMode2, uIScreenMode3, uIScreenMode4};
            $VALUES = uIScreenModeArr;
            $ENTRIES = new asp(uIScreenModeArr);
        }

        public UIScreenMode() {
            throw null;
        }

        public static UIScreenMode valueOf(String str) {
            return (UIScreenMode) Enum.valueOf(UIScreenMode.class, str);
        }

        public static UIScreenMode[] values() {
            return (UIScreenMode[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsEntryPointsViewState.kt */
    public static final class a implements fm50<ClipsEntryPointsState.a> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: ClipsEntryPointsViewState.kt */
    public static final class b {
        public final UIScreenMode a;
        public final boolean b;
        public final boolean c;
        public final int d;
        public final List<MediaStoreEntry> e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(UIScreenMode uIScreenMode, boolean z, boolean z2, int i, List<? extends MediaStoreEntry> list) {
            this.a = uIScreenMode;
            this.b = z;
            this.c = z2;
            this.d = i;
            this.e = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + shy.a(this.d, qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentUIState(screenMode=");
            sb.append(this.a);
            sb.append(", showTemplatesTab=");
            sb.append(this.b);
            sb.append(", showDraftsTab=");
            sb.append(this.c);
            sb.append(", draftsCounter=");
            sb.append(this.d);
            sb.append(", gallerySelectedItems=");
            return ms9.a(')', sb, this.e);
        }
    }

    /* compiled from: ClipsEntryPointsViewState.kt */
    public static final class c implements fm50<Object> {
        public static final c a = new c();
    }

    /* compiled from: ClipsEntryPointsViewState.kt */
    public static final class d implements fm50<ClipsEntryPointsState.b> {
        public static final d a = new d();
    }

    public ClipsEntryPointsViewState(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}

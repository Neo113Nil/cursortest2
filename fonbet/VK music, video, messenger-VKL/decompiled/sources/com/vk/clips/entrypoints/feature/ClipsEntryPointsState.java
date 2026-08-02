package com.vk.clips.entrypoints.feature;

import com.vk.clips.entrypoints.params.ClipsMediaPickerTab;
import com.vk.mediastore.system.MediaStoreEntry;
import defpackage.q0;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.km50;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: ClipsEntryPointsState.kt */
/* loaded from: classes16.dex */
public interface ClipsEntryPointsState extends km50 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsEntryPointsState.kt */
    public static final class ScreenMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScreenMode[] $VALUES;
        public static final ScreenMode DRAFTS;
        public static final ScreenMode PHOTO_PICKER;
        public static final ScreenMode TEMPLATES;
        public static final ScreenMode TRENDS;

        static {
            ScreenMode screenMode = new ScreenMode("PHOTO_PICKER", 0);
            PHOTO_PICKER = screenMode;
            ScreenMode screenMode2 = new ScreenMode("DRAFTS", 1);
            DRAFTS = screenMode2;
            ScreenMode screenMode3 = new ScreenMode("TEMPLATES", 2);
            TEMPLATES = screenMode3;
            ScreenMode screenMode4 = new ScreenMode("TRENDS", 3);
            TRENDS = screenMode4;
            ScreenMode[] screenModeArr = {screenMode, screenMode2, screenMode3, screenMode4};
            $VALUES = screenModeArr;
            $ENTRIES = new asp(screenModeArr);
        }

        public ScreenMode() {
            throw null;
        }

        public static ScreenMode valueOf(String str) {
            return (ScreenMode) Enum.valueOf(ScreenMode.class, str);
        }

        public static ScreenMode[] values() {
            return (ScreenMode[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsEntryPointsState.kt */
    public static final class a implements ClipsEntryPointsState {
        public final ScreenMode b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final List<MediaStoreEntry> g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ScreenMode screenMode, boolean z, boolean z2, boolean z3, int i, List<? extends MediaStoreEntry> list) {
            this.b = screenMode;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = i;
            this.g = list;
        }

        public static a a(a aVar, ScreenMode screenMode, List list, int i) {
            if ((i & 1) != 0) {
                screenMode = aVar.b;
            }
            ScreenMode screenMode2 = screenMode;
            boolean z = aVar.c;
            boolean z2 = aVar.d;
            boolean z3 = aVar.e;
            int i2 = aVar.f;
            if ((i & 32) != 0) {
                list = aVar.g;
            }
            aVar.getClass();
            return new a(screenMode2, z, z2, z3, i2, list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + shy.a(this.f, qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(screenMode=");
            sb.append(this.b);
            sb.append(", templatesEnabled=");
            sb.append(this.c);
            sb.append(", draftsEnabled=");
            sb.append(this.d);
            sb.append(", showDraftsTab=");
            sb.append(this.e);
            sb.append(", draftsCount=");
            sb.append(this.f);
            sb.append(", gallerySelectedItems=");
            return ms9.a(')', sb, this.g);
        }
    }

    /* compiled from: ClipsEntryPointsState.kt */
    public static final class b implements ClipsEntryPointsState {
        public final ClipsMediaPickerTab b;
        public final boolean c;
        public final boolean d;

        public b(ClipsMediaPickerTab clipsMediaPickerTab, boolean z, boolean z2) {
            this.b = clipsMediaPickerTab;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(defaultTab=");
            sb.append(this.b);
            sb.append(", templatesEnabled=");
            sb.append(this.c);
            sb.append(", draftsEnabled=");
            return q0.a(sb, this.d, ')');
        }
    }
}

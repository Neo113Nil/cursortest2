package com.vk.storycamera.picker.feature;

import com.vk.mediastore.system.MediaStoreEntry;
import defpackage.q0;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.vu5;
import xsna.zrp;

/* compiled from: StoryMediaPickerState.kt */
/* loaded from: classes6.dex */
public interface StoryMediaPickerState extends km50 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryMediaPickerState.kt */
    public static final class ScreenMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScreenMode[] $VALUES;
        public static final ScreenMode PHOTO_PICKER;
        public static final ScreenMode STORY_TEMPLATE;

        static {
            ScreenMode screenMode = new ScreenMode("PHOTO_PICKER", 0);
            PHOTO_PICKER = screenMode;
            ScreenMode screenMode2 = new ScreenMode("STORY_TEMPLATE", 1);
            STORY_TEMPLATE = screenMode2;
            ScreenMode[] screenModeArr = {screenMode, screenMode2};
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

    /* compiled from: StoryMediaPickerState.kt */
    public static final class a implements StoryMediaPickerState {
        public final ScreenMode b;
        public final List<MediaStoreEntry> c;
        public final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ScreenMode screenMode, List<? extends MediaStoreEntry> list, int i) {
            this.b = screenMode;
            this.c = list;
            this.d = i;
        }

        public static a a(a aVar, ScreenMode screenMode, List list, int i, int i2) {
            if ((i2 & 1) != 0) {
                screenMode = aVar.b;
            }
            if ((i2 & 2) != 0) {
                list = aVar.c;
            }
            if ((i2 & 4) != 0) {
                i = aVar.d;
            }
            aVar.getClass();
            return new a(screenMode, list, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + fw3.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(screenMode=");
            sb.append(this.b);
            sb.append(", gallerySelectedItems=");
            sb.append(this.c);
            sb.append(", newTemplateCount=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: StoryMediaPickerState.kt */
    public static final class b implements StoryMediaPickerState {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("Initial(forceTemplate="), this.b, ')');
        }
    }
}

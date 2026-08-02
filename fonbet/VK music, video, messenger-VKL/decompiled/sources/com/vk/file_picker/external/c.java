package com.vk.file_picker.external;

import java.io.File;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.xl50;

/* compiled from: ExternalFilePickerContract.kt */
/* loaded from: classes18.dex */
public abstract class c implements xl50 {

    /* compiled from: ExternalFilePickerContract.kt */
    public static final class a extends c {
        public final List<File> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends File> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Data(files="), this.b);
        }
    }

    /* compiled from: ExternalFilePickerContract.kt */
    public static final class b extends c {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Error(error="), this.b, ')');
        }
    }

    /* compiled from: ExternalFilePickerContract.kt */
    /* renamed from: com.vk.file_picker.external.c$c, reason: collision with other inner class name */
    public static final class C1067c extends c {
        public static final C1067c b = new C1067c();
    }
}

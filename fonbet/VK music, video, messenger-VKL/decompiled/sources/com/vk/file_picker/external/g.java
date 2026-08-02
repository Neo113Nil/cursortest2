package com.vk.file_picker.external;

import java.io.File;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;

/* compiled from: ExternalFilePickerContract.kt */
/* loaded from: classes18.dex */
public abstract class g {

    /* compiled from: ExternalFilePickerContract.kt */
    public static final class a extends g {
        public final List<File> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends File> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Data(files="), this.a);
        }
    }

    /* compiled from: ExternalFilePickerContract.kt */
    public static final class b extends g {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Error(errorRes="), this.a, ')');
        }
    }
}

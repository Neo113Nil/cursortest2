package com.vk.file_picker.external;

import xsna.air;
import xsna.kj50;
import xsna.tq;

/* compiled from: ExternalFilePickerContract.kt */
/* loaded from: classes18.dex */
public abstract class a implements kj50 {

    /* compiled from: ExternalFilePickerContract.kt */
    /* renamed from: com.vk.file_picker.external.a$a, reason: collision with other inner class name */
    public static final class C1066a extends a {
        public final int b = 128512;
        public final String c;

        public C1066a(String str) {
            this.c = str;
        }

        public final boolean equals(Object obj) {
            boolean equals;
            if (this != obj) {
                if (obj instanceof C1066a) {
                    C1066a c1066a = (C1066a) obj;
                    if (this.b == c1066a.b) {
                        String str = c1066a.c;
                        String str2 = this.c;
                        if (str2 == null) {
                            if (str == null) {
                                equals = true;
                                if (equals) {
                                }
                            }
                            equals = false;
                            if (equals) {
                            }
                        } else {
                            if (str != null) {
                                equals = str2.equals(str);
                                if (equals) {
                                }
                            }
                            equals = false;
                            if (equals) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleExternalResult(requestCode=");
            sb.append(this.b);
            sb.append(", uriData=");
            String str = this.c;
            return tq.f(sb, str == null ? "null" : air.b(')', "UriData(uriStringValue=", str), ')');
        }
    }

    /* compiled from: ExternalFilePickerContract.kt */
    public static final class b extends a {
        public static final b b = new b();
    }
}

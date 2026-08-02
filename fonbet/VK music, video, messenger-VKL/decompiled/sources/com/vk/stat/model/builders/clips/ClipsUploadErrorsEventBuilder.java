package com.vk.stat.model.builders.clips;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.erm0;
import xsna.irk0;
import xsna.l5m;
import xsna.qrk0;
import xsna.qsk0;
import xsna.zrp;

/* compiled from: ClipsUploadErrorsEventBuilder.kt */
/* loaded from: classes5.dex */
public final class ClipsUploadErrorsEventBuilder extends l5m {
    public final a h;
    public final b i;
    public final Integer j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsUploadErrorsEventBuilder.kt */
    public static final class ErrorType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType MISSING_FILE;
        public static final ErrorType OTHER;
        public static final ErrorType SHORT_VIDEO_API;
        public static final ErrorType TRANSCODER;
        public static final ErrorType UPLOAD_LIBRARY;

        static {
            ErrorType errorType = new ErrorType("UPLOAD_LIBRARY", 0);
            UPLOAD_LIBRARY = errorType;
            ErrorType errorType2 = new ErrorType("TRANSCODER", 1);
            TRANSCODER = errorType2;
            ErrorType errorType3 = new ErrorType("MISSING_FILE", 2);
            MISSING_FILE = errorType3;
            ErrorType errorType4 = new ErrorType("SHORT_VIDEO_API", 3);
            SHORT_VIDEO_API = errorType4;
            ErrorType errorType5 = new ErrorType(NativeAdContent.ViewTag.OTHER, 4);
            OTHER = errorType5;
            ErrorType[] errorTypeArr = {errorType, errorType2, errorType3, errorType4, errorType5};
            $VALUES = errorTypeArr;
            $ENTRIES = new asp(errorTypeArr);
        }

        public ErrorType() {
            throw null;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsUploadErrorsEventBuilder.kt */
    public interface a {

        /* compiled from: ClipsUploadErrorsEventBuilder.kt */
        /* renamed from: com.vk.stat.model.builders.clips.ClipsUploadErrorsEventBuilder$a$a, reason: collision with other inner class name */
        public static final class C1785a implements a {
            public static final C1785a a = new C1785a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1785a);
            }

            public final int hashCode() {
                return 1158440031;
            }

            public final String toString() {
                return "gallery_copy";
            }
        }

        /* compiled from: ClipsUploadErrorsEventBuilder.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1563698824;
            }

            public final String toString() {
                return "gallery_photo";
            }
        }

        /* compiled from: ClipsUploadErrorsEventBuilder.kt */
        public static final class c implements a {
            public final ErrorType a;
            public final String b;
            public final boolean c;

            public c(ErrorType errorType, String str, boolean z) {
                this.a = errorType;
                this.b = str;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && epx.f(this.b, cVar.b) && this.c == cVar.c;
            }

            public final int hashCode() {
                ErrorType errorType = this.a;
                int hashCode = (errorType == null ? 0 : errorType.hashCode()) * 31;
                String str = this.b;
                return Boolean.hashCode(this.c) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "upload_sending";
            }
        }
    }

    /* compiled from: ClipsUploadErrorsEventBuilder.kt */
    public interface b {

        /* compiled from: ClipsUploadErrorsEventBuilder.kt */
        public static final class a implements b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: ClipsUploadErrorsEventBuilder.kt */
        /* renamed from: com.vk.stat.model.builders.clips.ClipsUploadErrorsEventBuilder$b$b, reason: collision with other inner class name */
        public static final class C1786b implements b {
            public static final C1786b a = new C1786b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1786b);
            }

            public final int hashCode() {
                return -1938538342;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    public ClipsUploadErrorsEventBuilder(a.c cVar, b bVar, Integer num) {
        this(cVar, bVar, num, qsk0.a);
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String str;
        String str2;
        ErrorType errorType;
        String obj;
        b bVar = this.i;
        boolean z = bVar instanceof b.a;
        if (z) {
            Throwable th = ((b.a) bVar).a;
            StringBuilder sb = new StringBuilder();
            do {
                sb.append(String.valueOf(th));
                sb.append("\n");
                th = th != null ? th.getCause() : null;
                if (th == null) {
                    break;
                }
            } while (!th.equals(th.getCause()));
            str = sb.toString();
        } else {
            if (!epx.f(bVar, b.C1786b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        String D0 = str != null ? erm0.D0(1024, str) : null;
        if (z) {
            str2 = "error";
        } else {
            if (!epx.f(bVar, b.C1786b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "success";
        }
        String str3 = str2;
        String h = DevNullEventKey.CLIPS_UPLOAD_ERROR.h();
        a aVar = this.h;
        String obj2 = aVar.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj2.toLowerCase(locale);
        Integer num = this.j;
        String num2 = num != null ? num.toString() : null;
        boolean z2 = aVar instanceof a.c;
        a.c cVar = z2 ? (a.c) aVar : null;
        String lowerCase2 = (cVar == null || (errorType = cVar.a) == null || (obj = errorType.toString()) == null) ? null : obj.toLowerCase(locale);
        a.c cVar2 = z2 ? (a.c) aVar : null;
        String str4 = cVar2 != null ? cVar2.b : null;
        a.c cVar3 = z2 ? (a.c) aVar : null;
        Boolean valueOf = cVar3 != null ? Boolean.valueOf(cVar3.c) : null;
        this.g = new SchemeStat$TypeDevNullItem(h, D0, lowerCase, Integer.valueOf((valueOf == null || !valueOf.booleanValue()) ? 0 : 1), num2, null, str3, null, lowerCase2, null, str4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1376, 3, null);
        return super.p();
    }

    public ClipsUploadErrorsEventBuilder(a aVar, b bVar, Integer num, irk0 irk0Var) {
        super(irk0Var, null, 2);
        this.h = aVar;
        this.i = bVar;
        this.j = num;
    }
}

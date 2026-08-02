package defpackage;

import com.blaze.blazesdk.closed_captions.models.ui.b;
import com.blaze.blazesdk.closed_captions.models.ui.d;
import com.blaze.blazesdk.closed_captions.models.ui.e;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class acm {
    public final boolean a;
    public final mqi b;
    public final mqi c;
    public final mqi d;
    public final mqi e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends acm {
        public final boolean f;

        public b(boolean z) {
            super(false, 1, null);
            this.f = z;
        }

        public static b copy$default(b bVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f;
            }
            bVar.getClass();
            return new b(z);
        }

        @Override // defpackage.acm
        public final e a() {
            return null;
        }

        @Override // defpackage.acm
        public final boolean b() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f == ((b) obj).f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f);
        }

        public final String toString() {
            return lnb.r(new StringBuilder("Off(isSelected="), this.f, ')');
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c extends acm {
        public final e f;
        public final boolean g;
        public final boolean h;

        public c(@Nullable e eVar, boolean z, boolean z2) {
            super(z2, null);
            this.f = eVar;
            this.g = z;
            this.h = z2;
        }

        public static c copy$default(c cVar, e eVar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                eVar = cVar.f;
            }
            if ((i & 2) != 0) {
                z = cVar.g;
            }
            if ((i & 4) != 0) {
                z2 = cVar.h;
            }
            cVar.getClass();
            return new c(eVar, z, z2);
        }

        @Override // defpackage.acm
        public final e a() {
            return this.f;
        }

        @Override // defpackage.acm
        public final boolean b() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.c(this.f, cVar.f) && this.g == cVar.g && this.h == cVar.h;
        }

        public final int hashCode() {
            e eVar = this.f;
            return Boolean.hashCode(this.h) + u0a.t((eVar == null ? 0 : eVar.hashCode()) * 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecentlyUsed(languageModel=");
            sb.append(this.f);
            sb.append(", isSelected=");
            sb.append(this.g);
            sb.append(", isAvailable=");
            return lnb.r(sb, this.h, ')');
        }
    }

    public acm(boolean z) {
        this.a = z;
        final int i = 0;
        this.b = ypa.b(new Function0(this) { // from class: mbm
            public final /* synthetic */ acm b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String valueOf;
                String valueOf2;
                int i2 = i;
                acm acmVar = this.b;
                switch (i2) {
                    case 0:
                        break;
                    case 1:
                        e a2 = acmVar.a();
                        mqi mqiVar = acmVar.b;
                        if (!(a2 instanceof b)) {
                            if (!(a2 instanceof d)) {
                                if (a2 != null) {
                                    zzl.b();
                                    break;
                                }
                            }
                        } else {
                            Object value = mqiVar.getValue();
                            value.getClass();
                            String displayLanguage = ((Locale) value).getDisplayLanguage();
                            displayLanguage.getClass();
                            if (displayLanguage.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                char charAt = displayLanguage.charAt(0);
                                if (Character.isLowerCase(charAt)) {
                                    Object value2 = mqiVar.getValue();
                                    value2.getClass();
                                    valueOf = CharsKt.c(charAt, (Locale) value2);
                                } else {
                                    valueOf = String.valueOf(charAt);
                                }
                                sb.append((Object) valueOf);
                                sb.append(displayLanguage.substring(1));
                                break;
                            }
                        }
                        break;
                    case 2:
                        e a3 = acmVar.a();
                        mqi mqiVar2 = acmVar.b;
                        if (!(a3 instanceof b)) {
                            if (!(a3 instanceof d) && a3 != null) {
                                zzl.b();
                                break;
                            }
                        } else {
                            Object value3 = mqiVar2.getValue();
                            value3.getClass();
                            Object value4 = mqiVar2.getValue();
                            value4.getClass();
                            String displayLanguage2 = ((Locale) value3).getDisplayLanguage((Locale) value4);
                            displayLanguage2.getClass();
                            if (displayLanguage2.length() > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                char charAt2 = displayLanguage2.charAt(0);
                                if (Character.isLowerCase(charAt2)) {
                                    Object value5 = mqiVar2.getValue();
                                    value5.getClass();
                                    valueOf2 = CharsKt.c(charAt2, (Locale) value5);
                                } else {
                                    valueOf2 = String.valueOf(charAt2);
                                }
                                sb2.append((Object) valueOf2);
                                sb2.append(displayLanguage2.substring(1));
                                break;
                            }
                        }
                        break;
                    default:
                        e a4 = acmVar.a();
                        if (!(a4 instanceof b)) {
                            if (!(a4 instanceof d) && a4 != null) {
                                zzl.b();
                                break;
                            }
                        } else {
                            break;
                        }
                        break;
                }
                return null;
            }
        });
        final int i2 = 1;
        this.c = ypa.b(new Function0(this) { // from class: mbm
            public final /* synthetic */ acm b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String valueOf;
                String valueOf2;
                int i22 = i2;
                acm acmVar = this.b;
                switch (i22) {
                    case 0:
                        break;
                    case 1:
                        e a2 = acmVar.a();
                        mqi mqiVar = acmVar.b;
                        if (!(a2 instanceof b)) {
                            if (!(a2 instanceof d)) {
                                if (a2 != null) {
                                    zzl.b();
                                    break;
                                }
                            }
                        } else {
                            Object value = mqiVar.getValue();
                            value.getClass();
                            String displayLanguage = ((Locale) value).getDisplayLanguage();
                            displayLanguage.getClass();
                            if (displayLanguage.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                char charAt = displayLanguage.charAt(0);
                                if (Character.isLowerCase(charAt)) {
                                    Object value2 = mqiVar.getValue();
                                    value2.getClass();
                                    valueOf = CharsKt.c(charAt, (Locale) value2);
                                } else {
                                    valueOf = String.valueOf(charAt);
                                }
                                sb.append((Object) valueOf);
                                sb.append(displayLanguage.substring(1));
                                break;
                            }
                        }
                        break;
                    case 2:
                        e a3 = acmVar.a();
                        mqi mqiVar2 = acmVar.b;
                        if (!(a3 instanceof b)) {
                            if (!(a3 instanceof d) && a3 != null) {
                                zzl.b();
                                break;
                            }
                        } else {
                            Object value3 = mqiVar2.getValue();
                            value3.getClass();
                            Object value4 = mqiVar2.getValue();
                            value4.getClass();
                            String displayLanguage2 = ((Locale) value3).getDisplayLanguage((Locale) value4);
                            displayLanguage2.getClass();
                            if (displayLanguage2.length() > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                char charAt2 = displayLanguage2.charAt(0);
                                if (Character.isLowerCase(charAt2)) {
                                    Object value5 = mqiVar2.getValue();
                                    value5.getClass();
                                    valueOf2 = CharsKt.c(charAt2, (Locale) value5);
                                } else {
                                    valueOf2 = String.valueOf(charAt2);
                                }
                                sb2.append((Object) valueOf2);
                                sb2.append(displayLanguage2.substring(1));
                                break;
                            }
                        }
                        break;
                    default:
                        e a4 = acmVar.a();
                        if (!(a4 instanceof b)) {
                            if (!(a4 instanceof d) && a4 != null) {
                                zzl.b();
                                break;
                            }
                        } else {
                            break;
                        }
                        break;
                }
                return null;
            }
        });
        final int i3 = 2;
        this.d = ypa.b(new Function0(this) { // from class: mbm
            public final /* synthetic */ acm b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String valueOf;
                String valueOf2;
                int i22 = i3;
                acm acmVar = this.b;
                switch (i22) {
                    case 0:
                        break;
                    case 1:
                        e a2 = acmVar.a();
                        mqi mqiVar = acmVar.b;
                        if (!(a2 instanceof b)) {
                            if (!(a2 instanceof d)) {
                                if (a2 != null) {
                                    zzl.b();
                                    break;
                                }
                            }
                        } else {
                            Object value = mqiVar.getValue();
                            value.getClass();
                            String displayLanguage = ((Locale) value).getDisplayLanguage();
                            displayLanguage.getClass();
                            if (displayLanguage.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                char charAt = displayLanguage.charAt(0);
                                if (Character.isLowerCase(charAt)) {
                                    Object value2 = mqiVar.getValue();
                                    value2.getClass();
                                    valueOf = CharsKt.c(charAt, (Locale) value2);
                                } else {
                                    valueOf = String.valueOf(charAt);
                                }
                                sb.append((Object) valueOf);
                                sb.append(displayLanguage.substring(1));
                                break;
                            }
                        }
                        break;
                    case 2:
                        e a3 = acmVar.a();
                        mqi mqiVar2 = acmVar.b;
                        if (!(a3 instanceof b)) {
                            if (!(a3 instanceof d) && a3 != null) {
                                zzl.b();
                                break;
                            }
                        } else {
                            Object value3 = mqiVar2.getValue();
                            value3.getClass();
                            Object value4 = mqiVar2.getValue();
                            value4.getClass();
                            String displayLanguage2 = ((Locale) value3).getDisplayLanguage((Locale) value4);
                            displayLanguage2.getClass();
                            if (displayLanguage2.length() > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                char charAt2 = displayLanguage2.charAt(0);
                                if (Character.isLowerCase(charAt2)) {
                                    Object value5 = mqiVar2.getValue();
                                    value5.getClass();
                                    valueOf2 = CharsKt.c(charAt2, (Locale) value5);
                                } else {
                                    valueOf2 = String.valueOf(charAt2);
                                }
                                sb2.append((Object) valueOf2);
                                sb2.append(displayLanguage2.substring(1));
                                break;
                            }
                        }
                        break;
                    default:
                        e a4 = acmVar.a();
                        if (!(a4 instanceof b)) {
                            if (!(a4 instanceof d) && a4 != null) {
                                zzl.b();
                                break;
                            }
                        } else {
                            break;
                        }
                        break;
                }
                return null;
            }
        });
        final int i4 = 3;
        this.e = ypa.b(new Function0(this) { // from class: mbm
            public final /* synthetic */ acm b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String valueOf;
                String valueOf2;
                int i22 = i4;
                acm acmVar = this.b;
                switch (i22) {
                    case 0:
                        break;
                    case 1:
                        e a2 = acmVar.a();
                        mqi mqiVar = acmVar.b;
                        if (!(a2 instanceof b)) {
                            if (!(a2 instanceof d)) {
                                if (a2 != null) {
                                    zzl.b();
                                    break;
                                }
                            }
                        } else {
                            Object value = mqiVar.getValue();
                            value.getClass();
                            String displayLanguage = ((Locale) value).getDisplayLanguage();
                            displayLanguage.getClass();
                            if (displayLanguage.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                char charAt = displayLanguage.charAt(0);
                                if (Character.isLowerCase(charAt)) {
                                    Object value2 = mqiVar.getValue();
                                    value2.getClass();
                                    valueOf = CharsKt.c(charAt, (Locale) value2);
                                } else {
                                    valueOf = String.valueOf(charAt);
                                }
                                sb.append((Object) valueOf);
                                sb.append(displayLanguage.substring(1));
                                break;
                            }
                        }
                        break;
                    case 2:
                        e a3 = acmVar.a();
                        mqi mqiVar2 = acmVar.b;
                        if (!(a3 instanceof b)) {
                            if (!(a3 instanceof d) && a3 != null) {
                                zzl.b();
                                break;
                            }
                        } else {
                            Object value3 = mqiVar2.getValue();
                            value3.getClass();
                            Object value4 = mqiVar2.getValue();
                            value4.getClass();
                            String displayLanguage2 = ((Locale) value3).getDisplayLanguage((Locale) value4);
                            displayLanguage2.getClass();
                            if (displayLanguage2.length() > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                char charAt2 = displayLanguage2.charAt(0);
                                if (Character.isLowerCase(charAt2)) {
                                    Object value5 = mqiVar2.getValue();
                                    value5.getClass();
                                    valueOf2 = CharsKt.c(charAt2, (Locale) value5);
                                } else {
                                    valueOf2 = String.valueOf(charAt2);
                                }
                                sb2.append((Object) valueOf2);
                                sb2.append(displayLanguage2.substring(1));
                                break;
                            }
                        }
                        break;
                    default:
                        e a4 = acmVar.a();
                        if (!(a4 instanceof b)) {
                            if (!(a4 instanceof d) && a4 != null) {
                                zzl.b();
                                break;
                            }
                        } else {
                            break;
                        }
                        break;
                }
                return null;
            }
        });
    }

    public abstract e a();

    public abstract boolean b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends acm {
        public final e f;
        public final boolean g;

        public a(@Nullable e eVar, boolean z) {
            super(false, 1, null);
            this.f = eVar;
            this.g = z;
        }

        public static a copy$default(a aVar, e eVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                eVar = aVar.f;
            }
            if ((i & 2) != 0) {
                z = aVar.g;
            }
            aVar.getClass();
            return new a(eVar, z);
        }

        @Override // defpackage.acm
        public final e a() {
            return this.f;
        }

        @Override // defpackage.acm
        public final boolean b() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.c(this.f, aVar.f) && this.g == aVar.g;
        }

        public final int hashCode() {
            e eVar = this.f;
            return Boolean.hashCode(this.g) + ((eVar == null ? 0 : eVar.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AvailableLang(languageModel=");
            sb.append(this.f);
            sb.append(", isSelected=");
            return lnb.r(sb, this.g, ')');
        }

        public /* synthetic */ a(e eVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(eVar, (i & 2) != 0 ? false : z);
        }
    }

    public /* synthetic */ acm(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public /* synthetic */ acm(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, null);
    }
}

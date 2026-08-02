package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsz {
    public static final zzsz c;
    public static final zzsz d;
    public static final zzsz e;
    public static final /* synthetic */ zzsz[] f;
    public final zzta a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    zzsz EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzsz EF2;

    static {
        zzsz zzszVar = new zzsz("DOUBLE", 0, zzta.d, 1);
        zzsz zzszVar2 = new zzsz("FLOAT", 1, zzta.c, 5);
        zzta zztaVar = zzta.b;
        zzsz zzszVar3 = new zzsz("INT64", 2, zztaVar, 0);
        c = zzszVar3;
        zzsz zzszVar4 = new zzsz("UINT64", 3, zztaVar, 0);
        zzta zztaVar2 = zzta.a;
        zzsz zzszVar5 = new zzsz("INT32", 4, zztaVar2, 0);
        zzsz zzszVar6 = new zzsz("FIXED64", 5, zztaVar, 1);
        zzsz zzszVar7 = new zzsz("FIXED32", 6, zztaVar2, 5);
        zzsz zzszVar8 = new zzsz("BOOL", 7, zzta.e, 0);
        zzsz zzszVar9 = new zzsz("STRING", 8, zzta.f, 2);
        d = zzszVar9;
        zzta zztaVar3 = zzta.i;
        zzsz zzszVar10 = new zzsz("GROUP", 9, zztaVar3, 3);
        e = zzszVar10;
        f = new zzsz[]{zzszVar, zzszVar2, zzszVar3, zzszVar4, zzszVar5, zzszVar6, zzszVar7, zzszVar8, zzszVar9, zzszVar10, new zzsz("MESSAGE", 10, zztaVar3, 2), new zzsz("BYTES", 11, zzta.g, 2), new zzsz("UINT32", 12, zztaVar2, 0), new zzsz("ENUM", 13, zzta.h, 0), new zzsz("SFIXED32", 14, zztaVar2, 5), new zzsz("SFIXED64", 15, zztaVar, 1), new zzsz("SINT32", 16, zztaVar2, 0), new zzsz("SINT64", 17, zztaVar, 0)};
    }

    public zzsz(String str, int i, zzta zztaVar, int i2) {
        this.a = zztaVar;
        this.b = i2;
    }

    public static zzsz[] values() {
        return (zzsz[]) f.clone();
    }
}

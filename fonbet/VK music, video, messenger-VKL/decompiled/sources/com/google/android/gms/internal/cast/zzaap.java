package com.google.android.gms.internal.cast;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzaap {
    public static final zzaap zza;
    public static final zzaap zzb;
    public static final zzaap zzc;
    public static final zzaap zzd;
    public static final zzaap zze;
    public static final zzaap zzf;
    public static final zzaap zzg;
    public static final zzaap zzh;
    public static final zzaap zzi;
    public static final zzaap zzj;
    public static final zzaap zzk;
    public static final zzaap zzl;
    public static final zzaap zzm;
    public static final zzaap zzn;
    public static final zzaap zzo;
    public static final zzaap zzp;
    public static final zzaap zzq;
    public static final zzaap zzr;
    private static final /* synthetic */ zzaap[] zzt;
    private final zzaaq zzs;

    static {
        zzaap zzaapVar = new zzaap("DOUBLE", 0, zzaaq.DOUBLE, 1);
        zza = zzaapVar;
        zzaap zzaapVar2 = new zzaap("FLOAT", 1, zzaaq.FLOAT, 5);
        zzb = zzaapVar2;
        zzaaq zzaaqVar = zzaaq.LONG;
        zzaap zzaapVar3 = new zzaap("INT64", 2, zzaaqVar, 0);
        zzc = zzaapVar3;
        zzaap zzaapVar4 = new zzaap("UINT64", 3, zzaaqVar, 0);
        zzd = zzaapVar4;
        zzaaq zzaaqVar2 = zzaaq.INT;
        zzaap zzaapVar5 = new zzaap("INT32", 4, zzaaqVar2, 0);
        zze = zzaapVar5;
        zzaap zzaapVar6 = new zzaap("FIXED64", 5, zzaaqVar, 1);
        zzf = zzaapVar6;
        zzaap zzaapVar7 = new zzaap("FIXED32", 6, zzaaqVar2, 5);
        zzg = zzaapVar7;
        zzaap zzaapVar8 = new zzaap("BOOL", 7, zzaaq.BOOLEAN, 0);
        zzh = zzaapVar8;
        zzaap zzaapVar9 = new zzaap("STRING", 8, zzaaq.STRING, 2);
        zzi = zzaapVar9;
        zzaaq zzaaqVar3 = zzaaq.MESSAGE;
        zzaap zzaapVar10 = new zzaap("GROUP", 9, zzaaqVar3, 3);
        zzj = zzaapVar10;
        zzaap zzaapVar11 = new zzaap("MESSAGE", 10, zzaaqVar3, 2);
        zzk = zzaapVar11;
        zzaap zzaapVar12 = new zzaap("BYTES", 11, zzaaq.BYTE_STRING, 2);
        zzl = zzaapVar12;
        zzaap zzaapVar13 = new zzaap("UINT32", 12, zzaaqVar2, 0);
        zzm = zzaapVar13;
        zzaap zzaapVar14 = new zzaap("ENUM", 13, zzaaq.ENUM, 0);
        zzn = zzaapVar14;
        zzaap zzaapVar15 = new zzaap("SFIXED32", 14, zzaaqVar2, 5);
        zzo = zzaapVar15;
        zzaap zzaapVar16 = new zzaap("SFIXED64", 15, zzaaqVar, 1);
        zzp = zzaapVar16;
        zzaap zzaapVar17 = new zzaap("SINT32", 16, zzaaqVar2, 0);
        zzq = zzaapVar17;
        zzaap zzaapVar18 = new zzaap("SINT64", 17, zzaaqVar, 0);
        zzr = zzaapVar18;
        zzt = new zzaap[]{zzaapVar, zzaapVar2, zzaapVar3, zzaapVar4, zzaapVar5, zzaapVar6, zzaapVar7, zzaapVar8, zzaapVar9, zzaapVar10, zzaapVar11, zzaapVar12, zzaapVar13, zzaapVar14, zzaapVar15, zzaapVar16, zzaapVar17, zzaapVar18};
    }

    private zzaap(String str, int i, zzaaq zzaaqVar, int i2) {
        this.zzs = zzaaqVar;
    }

    public static zzaap[] values() {
        return (zzaap[]) zzt.clone();
    }

    public final zzaaq zza() {
        return this.zzs;
    }
}

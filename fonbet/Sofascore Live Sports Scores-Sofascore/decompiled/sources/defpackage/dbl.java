package defpackage;

import com.google.protobuf.CodedInputStream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class dbl {
    public static final abl a;
    public static final bbl b;
    public static final /* synthetic */ dbl[] c;

    static {
        abl ablVar = new abl();
        a = ablVar;
        bbl bblVar = new bbl();
        b = bblVar;
        c = new dbl[]{ablVar, bblVar, new dbl() { // from class: cbl
            @Override // defpackage.dbl
            public final Object a(CodedInputStream codedInputStream) {
                return codedInputStream.readBytes();
            }
        }};
    }

    public static dbl valueOf(String str) {
        return (dbl) Enum.valueOf(dbl.class, str);
    }

    public static dbl[] values() {
        return (dbl[]) c.clone();
    }

    public abstract Object a(CodedInputStream codedInputStream);
}

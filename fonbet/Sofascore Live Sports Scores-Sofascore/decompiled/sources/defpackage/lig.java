package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum lig {
    VIEWABLE("Viewable"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_VIEWABLE("NotViewable"),
    /* JADX INFO: Fake field, exist only in values array */
    VIEW_UNDETERMINED("ViewUndetermined");

    public static final List c;
    public static final List d;
    public static final List e;
    public final String a;

    static {
        lig ligVar = VIEWABLE;
        lig ligVar2 = NOT_VIEWABLE;
        lig ligVar3 = VIEW_UNDETERMINED;
        c = Arrays.asList(ligVar, ligVar2, ligVar3);
        d = Arrays.asList(new lig[0]);
        e = Arrays.asList(ligVar, ligVar2, ligVar3);
    }

    lig(String str) {
        this.a = str;
    }

    public static lig a(String str) {
        for (lig ligVar : values()) {
            if (ligVar.a.equalsIgnoreCase(str)) {
                return ligVar;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}

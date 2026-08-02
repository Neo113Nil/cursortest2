package kotlin.text;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/text/f;", "", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "a", "()I", FormPageDTO.Field.FIELD_TYPE_MASK, "getMask", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CANON_EQ;
    public static final f COMMENTS;
    public static final f DOT_MATCHES_ALL;
    public static final f IGNORE_CASE;
    public static final f LITERAL;
    public static final f MULTILINE;
    public static final f UNIX_LINES;
    private final int mask;
    private final int value;

    static {
        f fVar = new f("IGNORE_CASE", 0, 2, 0, 2, null);
        IGNORE_CASE = fVar;
        f fVar2 = new f("MULTILINE", 1, 8, 0, 2, null);
        MULTILINE = fVar2;
        f fVar3 = new f("LITERAL", 2, 16, 0, 2, null);
        LITERAL = fVar3;
        f fVar4 = new f("UNIX_LINES", 3, 1, 0, 2, null);
        UNIX_LINES = fVar4;
        f fVar5 = new f("COMMENTS", 4, 4, 0, 2, null);
        COMMENTS = fVar5;
        f fVar6 = new f("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
        DOT_MATCHES_ALL = fVar6;
        f fVar7 = new f("CANON_EQ", 6, UserVerificationMethods.USER_VERIFY_PATTERN, 0, 2, null);
        CANON_EQ = fVar7;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
        $VALUES = fVarArr;
        $ENTRIES = Xc.b.a(fVarArr);
    }

    private f() {
        throw null;
    }

    f(String str, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        i13 = (i14 & 2) != 0 ? i12 : i13;
        this.value = i12;
        this.mask = i13;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}

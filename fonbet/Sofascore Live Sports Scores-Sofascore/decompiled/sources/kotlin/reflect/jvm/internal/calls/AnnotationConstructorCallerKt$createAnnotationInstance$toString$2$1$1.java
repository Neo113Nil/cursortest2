package kotlin.reflect.jvm.internal.calls;

import com.ironsource.C4427z5;
import defpackage.xka;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "", "entry", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 extends xka implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {
    public static final AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 INSTANCE = new AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1();

    public AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull Map.Entry<String, ? extends Object> entry) {
        String obj;
        entry.getClass();
        String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            obj = Arrays.toString((boolean[]) value);
            obj.getClass();
        } else if (value instanceof char[]) {
            obj = Arrays.toString((char[]) value);
            obj.getClass();
        } else if (value instanceof byte[]) {
            obj = Arrays.toString((byte[]) value);
            obj.getClass();
        } else if (value instanceof short[]) {
            obj = Arrays.toString((short[]) value);
            obj.getClass();
        } else if (value instanceof int[]) {
            obj = Arrays.toString((int[]) value);
            obj.getClass();
        } else if (value instanceof float[]) {
            obj = Arrays.toString((float[]) value);
            obj.getClass();
        } else if (value instanceof long[]) {
            obj = Arrays.toString((long[]) value);
            obj.getClass();
        } else if (value instanceof double[]) {
            obj = Arrays.toString((double[]) value);
            obj.getClass();
        } else if (value instanceof Object[]) {
            obj = Arrays.toString((Object[]) value);
            obj.getClass();
        } else {
            obj = value.toString();
        }
        return key + C4427z5.U + obj;
    }
}

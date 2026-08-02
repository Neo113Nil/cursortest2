package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import Ae.x0;
import java.lang.reflect.Field;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class z<STATE> extends id.c<STATE> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<STATE> f86941a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f86942b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ALL;
        public static final a NONE;
        public static final a STATE;

        static {
            a aVar = new a("NONE", 0);
            NONE = aVar;
            a aVar2 = new a("STATE", 1);
            STATE = aVar2;
            a aVar3 = new a("ALL", 2);
            ALL = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86943a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86943a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@NotNull x0<STATE> flow, @NotNull STATE initialValue, @NotNull a logLevel) {
        super(initialValue);
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.f86941a = flow;
        this.f86942b = logLevel;
    }

    private static String a(Object obj) {
        K k11 = new K();
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(obj2.length());
        int i11 = 0;
        while (i11 < obj2.length()) {
            char charAt = obj2.charAt(i11);
            if (charAt != '(') {
                if (charAt != ')') {
                    if (charAt == ',') {
                        sb2.append(charAt);
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                        int i12 = k11.f71785a * 8;
                        sb2.append(i12 >= 0 ? kotlin.text.h.P("", i12, ' ') : "");
                        int i13 = i11 + 1;
                        if (i13 >= 0 && i13 < obj2.length()) {
                            charAt = obj2.charAt(i13);
                        }
                        if (charAt == ' ') {
                            i11 = i13;
                        }
                        Unit unit = Unit.f71690a;
                    } else if (charAt != '[') {
                        if (charAt != ']') {
                            if (charAt != '{') {
                                if (charAt != '}') {
                                    sb2.append(charAt);
                                }
                            }
                        }
                    }
                    i11++;
                }
                k11.f71785a--;
                sb2.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                int i14 = k11.f71785a * 8;
                sb2.append(i14 >= 0 ? kotlin.text.h.P("", i14, ' ') : "");
                sb2.append(charAt);
                i11++;
            }
            k11.f71785a++;
            sb2.append(charAt);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            int i15 = k11.f71785a * 8;
            sb2.append(i15 >= 0 ? kotlin.text.h.P("", i15, ' ') : "");
            i11++;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // id.c
    protected final void afterChange(@NotNull kotlin.reflect.m<?> property, @NotNull STATE oldValue, @NotNull STATE newValue) {
        String a11;
        Pair pair;
        Pair pair2;
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.d(newValue, oldValue);
        int i11 = b.f86943a[this.f86942b.ordinal()];
        if (i11 == 1) {
            String a12 = a(oldValue);
            Field[] fields = newValue.getClass().getFields();
            Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
            int length = fields.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    a11 = a(newValue);
                    break;
                } else {
                    if (Intrinsics.d(fields[i12].getName(), "INSTANCE")) {
                        a11 = newValue.getClass().getSimpleName();
                        break;
                    }
                    i12++;
                }
            }
            pair = new Pair(a12, a11);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new Sc.o();
                }
                pair2 = new Pair(null, null);
                this.f86941a.setValue(newValue);
            }
            pair = new Pair(oldValue.getClass().getSimpleName(), newValue.getClass().getSimpleName());
        }
        pair2 = pair;
        this.f86941a.setValue(newValue);
    }
}

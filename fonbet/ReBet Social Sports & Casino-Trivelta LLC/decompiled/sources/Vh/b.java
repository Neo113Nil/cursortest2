package Vh;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12894a;

    /* renamed from: b, reason: collision with root package name */
    public final Function3 f12895b;

    /* renamed from: c, reason: collision with root package name */
    public final Function3 f12896c;

    /* renamed from: d, reason: collision with root package name */
    public final Function3 f12897d;

    public b(Object obj, Function3 function3, Function3 function32) {
        Function3 function33;
        this.f12894a = obj;
        this.f12895b = function3;
        this.f12896c = function32;
        function33 = g.f12902a;
        this.f12897d = function33;
    }

    public /* synthetic */ b(Object obj, Function3 function3, Function3 function32, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, (i10 & 4) != 0 ? null : function32);
    }
}

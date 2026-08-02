package ru.ozon.app.android.session.session.presentation.viewModel;

import com.squareup.moshi.D;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/ParameterizedType;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SessionViewModel$type$2 extends AbstractC7737t implements Function0<ParameterizedType> {
    public static final SessionViewModel$type$2 INSTANCE = new SessionViewModel$type$2();

    SessionViewModel$type$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ParameterizedType invoke() {
        return D.e(Map.class, String.class, Object.class);
    }
}

package ru.ozon.android.messenger.framework.data.remote.parser;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d implements JsonAdapter.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.initialization.d f87830a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.logger.a f87831b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Z9.a f87832c;

    public d(@NotNull ru.ozon.android.messenger.framework.core.initialization.d messengerConfig, @NotNull ru.ozon.android.messenger.framework.logger.a logger) {
        Intrinsics.checkNotNullParameter(messengerConfig, "messengerConfig");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f87830a = messengerConfig;
        this.f87831b = logger;
        this.f87832c = new Z9.a();
    }

    private final void a(Class<?> cls) {
        if (this.f87830a.getOzonLoggerEnabled()) {
            this.f87831b.a(ru.ozon.android.ozonLogger.core.c.ERROR, V.e.b(new Object[]{cls.getCanonicalName()}, 1, "[ReflectionUsageForDTO] Avoid use reflection for parsing models. Cause = %s", "format(...)"), sj.f.a(U.i(new Pair("class_name", cls))));
        }
    }

    @Override // com.squareup.moshi.JsonAdapter.a
    public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        String name;
        String name2;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonAdapter<?> create = this.f87832c.create(type, C7714v.X0(annotations), moshi);
        Class<?> c11 = D.c(type);
        Boolean bool = null;
        if (create != null) {
            Intrinsics.f(c11);
            Package r22 = c11.getPackage();
            if (r22 != null && (name2 = r22.getName()) != null) {
                bool = Boolean.valueOf(h.e0(name2, "ru.ozon.android.messenger", false));
            }
            if (!Intrinsics.d(bool, Boolean.FALSE) && !c11.isEnum()) {
                Annotation[] annotations2 = c11.getAnnotations();
                Intrinsics.checkNotNullExpressionValue(annotations2, "getAnnotations(...)");
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : annotations2) {
                    if (annotation instanceof j) {
                        arrayList.add(annotation);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((j) it.next()).generateAdapter()) {
                            }
                        }
                    }
                }
                a(c11);
                return create;
            }
        } else {
            Intrinsics.f(c11);
            Package r23 = c11.getPackage();
            if (r23 != null && (name = r23.getName()) != null) {
                bool = Boolean.valueOf(h.e0(name, "ru.ozon.android.messenger", false));
            }
            if (Intrinsics.d(bool, Boolean.TRUE) && !c11.isEnum()) {
                a(c11);
            }
        }
        return create;
    }
}

package ru.ozon.app.android.network.serialize;

import Sc.InterfaceC4008j;
import Sc.k;
import U7.d;
import Z9.a;
import android.content.Context;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\r\u0010\fJ3\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/network/serialize/OzonKotlinJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$a;", "Landroid/content/Context;", "context", "", "isDebug", "<init>", "(Landroid/content/Context;Z)V", "Ljava/lang/Class;", "rawType", "", "processForDebug", "(Ljava/lang/Class;)V", "processForRelease", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/Moshi;)Lcom/squareup/moshi/JsonAdapter;", "Z", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "LSc/j;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "", "packageName", "Ljava/lang/String;", "LZ9/a;", "kotlinJsonAdapterFactory", "LZ9/a;", "ReflectionUsageException", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonKotlinJsonAdapterFactory implements JsonAdapter.a {

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j featureChecker;
    private final boolean isDebug;

    @NotNull
    private final a kotlinJsonAdapterFactory;

    @NotNull
    private final String packageName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/network/serialize/OzonKotlinJsonAdapterFactory$ReflectionUsageException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "clazz", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    private static final class ReflectionUsageException extends IllegalArgumentException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReflectionUsageException(@NotNull Class<?> clazz) {
            super(Nk.a.b("Avoid use reflection for parsing models. Add JsonClass(generateAdapter = true) annotation over your class: ", clazz.getCanonicalName()));
            Intrinsics.checkNotNullParameter(clazz, "clazz");
        }
    }

    public OzonKotlinJsonAdapterFactory(@NotNull Context context, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isDebug = z11;
        this.featureChecker = k.b(new OzonKotlinJsonAdapterFactory$featureChecker$2(context));
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.packageName = h.X(packageName, ".qa", "", false);
        this.kotlinJsonAdapterFactory = new a();
    }

    private final FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    private final void processForDebug(Class<?> rawType) {
        String canonicalName = rawType.getCanonicalName();
        if (canonicalName != null) {
            if (h.e0(canonicalName, this.packageName, false)) {
                Annotation[] annotations = rawType.getAnnotations();
                Intrinsics.checkNotNullExpressionValue(annotations, "getAnnotations(...)");
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof j) {
                        arrayList.add(annotation);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((j) it.next()).generateAdapter()) {
                        }
                    }
                    return;
                }
                throw new ReflectionUsageException(rawType);
            }
        }
    }

    private final void processForRelease(Class<?> rawType) {
        Annotation[] annotations = rawType.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "getAnnotations(...)");
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : annotations) {
            if (annotation instanceof j) {
                arrayList.add(annotation);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((j) it.next()).generateAdapter()) {
                }
            }
            return;
        }
        if (getFeatureChecker().isEnabled(MoshiReflectionNonFatalFlag.INSTANCE)) {
            LoggerExtKt.sendNonFatal$default(null, d.e(rawType.getCanonicalName(), " doesn't use JsonClass annotation."), "moshi_reflection_non_fatals", null, 9, null);
        }
        if (BuildUtils.INSTANCE.isQaFlavor() && getFeatureChecker().isEnabled(CrashOnMoshiReflectionFlag.INSTANCE)) {
            throw new ReflectionUsageException(rawType);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter.a
    public JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonAdapter<?> create = this.kotlinJsonAdapterFactory.create(type, annotations, moshi);
        if (create != null) {
            Class<?> c11 = D.c(type);
            if (this.isDebug) {
                processForDebug(c11);
                return create;
            }
            processForRelease(c11);
        }
        return create;
    }
}

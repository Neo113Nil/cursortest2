package ru.ozon.app.android.atoms.proto;

import Sc.InterfaceC3999a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\tR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\tR\u0015\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/atoms/proto/OneOfSignature;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "fieldName", "Lkotlin/reflect/d;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/reflect/d;)V", "()Ljava/lang/String;", "()Ljava/lang/Class;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes11.dex */
public @interface OneOfSignature {
    String fieldName() default "";

    String name();

    Class<?> type();
}

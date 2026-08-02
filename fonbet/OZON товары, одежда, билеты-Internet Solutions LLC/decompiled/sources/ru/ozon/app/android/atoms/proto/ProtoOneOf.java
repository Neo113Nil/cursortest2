package ru.ozon.app.android.atoms.proto;

import Sc.InterfaceC3999a;
import com.squareup.moshi.m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0018\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0007R\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/atoms/proto/ProtoOneOf;", "", "label", "", "signatures", "", "Lru/ozon/app/android/atoms/proto/OneOfSignature;", "()Ljava/lang/String;", "()[Lru/ozon/app/android/atoms/proto/OneOfSignature;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface ProtoOneOf {
    String label() default "";

    OneOfSignature[] signatures();
}

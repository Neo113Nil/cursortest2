package p00;

import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* renamed from: p00.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC8826b<T> {

    /* renamed from: p00.b$a */
    public static abstract class a implements InterfaceC8826b<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlin.reflect.d<Boolean> f80005a = N.b(Boolean.TYPE);

        @Override // p00.InterfaceC8826b
        @NotNull
        public final kotlin.reflect.d<Boolean> a() {
            return this.f80005a;
        }

        @NotNull
        public abstract String b();

        @Override // p00.InterfaceC8826b
        public final /* bridge */ /* synthetic */ Boolean getDefaultValue() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: p00.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC1343b implements InterfaceC8826b<String> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlin.reflect.d<String> f80006a = N.b(String.class);

        @Override // p00.InterfaceC8826b
        @NotNull
        public final kotlin.reflect.d<String> a() {
            return this.f80006a;
        }

        @NotNull
        public abstract String b();

        @Override // p00.InterfaceC8826b
        public final String getDefaultValue() {
            return "";
        }
    }

    @NotNull
    kotlin.reflect.d<T> a();

    @NotNull
    T getDefaultValue();

    @NotNull
    String getName();
}

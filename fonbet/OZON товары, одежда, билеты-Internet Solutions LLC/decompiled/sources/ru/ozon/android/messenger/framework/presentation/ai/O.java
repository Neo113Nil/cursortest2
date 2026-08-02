package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface O {

    public static final class a implements O {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89317a;

        public a(@NotNull String newText) {
            Intrinsics.checkNotNullParameter(newText, "newText");
            this.f89317a = newText;
        }

        @NotNull
        public final String a() {
            return this.f89317a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f89317a, ((a) obj).f89317a);
        }

        public final int hashCode() {
            return this.f89317a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C.o0.c(new StringBuilder("UpdateText(newText="), this.f89317a, ")");
        }
    }
}

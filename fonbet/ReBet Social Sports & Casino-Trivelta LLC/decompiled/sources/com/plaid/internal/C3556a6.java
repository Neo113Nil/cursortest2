package com.plaid.internal;

import java.util.Arrays;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.a6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3556a6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f39823a = new a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static Y3 f39824b = C3690m4.f40796a;

    @SourceDebugExtension({"SMAP\nPlog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Plog.kt\ncom/plaid/core/log/internal/Plog$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,171:1\n26#2:172\n26#2:173\n26#2:174\n26#2:175\n26#2:176\n26#2:177\n26#2:178\n26#2:179\n26#2:180\n26#2:181\n*S KotlinDebug\n*F\n+ 1 Plog.kt\ncom/plaid/core/log/internal/Plog$Companion\n*L\n23#1:172\n35#1:173\n53#1:174\n65#1:175\n83#1:176\n95#1:177\n113#1:178\n125#1:179\n143#1:180\n155#1:181\n*E\n"})
    /* renamed from: com.plaid.internal.a6$a */
    public static final class a {
        @JvmStatic
        public static void a(@Nullable String str, boolean z10) {
            C3556a6.f39824b.d(str, Arrays.copyOf(new Object[0], 0), z10);
        }

        public static void b(a aVar, Throwable th2, String str) {
            aVar.getClass();
            C3556a6.f39824b.b(th2, str, Arrays.copyOf(new Object[0], 0), true);
        }

        public static void c(a aVar, String str) {
            aVar.getClass();
            C3556a6.f39824b.c(str, Arrays.copyOf(new Object[0], 0), true);
        }

        public static void d(a aVar, String str) {
            aVar.getClass();
            C3556a6.f39824b.a(str, Arrays.copyOf(new Object[0], 0), true);
        }

        public static void e(a aVar, String str) {
            aVar.getClass();
            C3556a6.f39824b.e(str, Arrays.copyOf(new Object[0], 0), true);
        }

        public static /* synthetic */ void a(a aVar, String str) {
            aVar.getClass();
            a(str, true);
        }

        public static void a(a aVar, String str, Object[] args) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(args, "args");
            C3556a6.f39824b.d(str, new Object[]{args}, true);
        }

        public static void b(a aVar, String str) {
            aVar.getClass();
            C3556a6.f39824b.b(str, Arrays.copyOf(new Object[0], 0), true);
        }

        public static void a(a aVar, Throwable th2, String str) {
            aVar.getClass();
            C3556a6.f39824b.a(th2, str, Arrays.copyOf(new Object[0], 0), true);
        }

        public static void b(a aVar, String str, Object[] args) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(args, "args");
            C3556a6.f39824b.b(str, new Object[]{args}, true);
        }

        public static void a(a aVar, Throwable th2) {
            aVar.getClass();
            C3556a6.f39824b.b(th2, true);
        }
    }
}

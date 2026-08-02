package Ee;

import Ze.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: Ee.a$a, reason: collision with other inner class name */
    public static final class C0072a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0072a f3084d = new C0072a();

        public C0072a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Regex.INSTANCE.escape(it);
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f3085d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f3086e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z10) {
            super(1);
            this.f3085d = str;
            this.f3086e = z10;
        }

        public final CharSequence a(a.AbstractC0310a condition) {
            Intrinsics.checkNotNullParameter(condition, "condition");
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return a(null);
        }
    }

    public static final String a(De.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return "(^|\\s|<br>)\\[((?:(?!\\]\\(.+?\\)).)+?)\\]\\((<?(" + b(bVar, true) + ")>?)\\)(?=$|\\s|\\.|,|\\n|<br>|<span)";
    }

    public static final String b(De.b bVar, boolean z10) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return "\\b(" + Regex.INSTANCE.escape(bVar.c()) + ")://(" + (bVar.a().isEmpty() ? "[^\\s/]+" : CollectionsKt.joinToString$default(bVar.a(), "|", null, null, 0, null, C0072a.f3084d, 30, null)) + ")(" + (bVar.b().isEmpty() ? z10 ? "[^\\s)>]*" : "(?:#|\\?|/|$|\\s|[?#!])[^\\s]*" : CollectionsKt.joinToString$default(bVar.b(), "|", null, null, 0, null, new b(z10 ? "(?=$|\\s|[?#!>)])" : "(?=$|\\s|[?#!])", z10), 30, null)) + ')';
    }
}

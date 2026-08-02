package d5;

import Q5.ViewContext;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y5.C6854a;

/* renamed from: d5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4007c {

    /* renamed from: a, reason: collision with root package name */
    public final String f44967a;

    /* renamed from: d5.c$a */
    public static final class a extends AbstractC4007c {

        /* renamed from: b, reason: collision with root package name */
        public final EnumC4005a f44968b;

        /* renamed from: c, reason: collision with root package name */
        public final C6854a f44969c;

        /* renamed from: d, reason: collision with root package name */
        public final ViewContext f44970d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC4005a direction, C6854a touchCoordinates, ViewContext viewContext) {
            super(ViewProps.SCROLL, null);
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(touchCoordinates, "touchCoordinates");
            this.f44968b = direction;
            this.f44969c = touchCoordinates;
            this.f44970d = viewContext;
        }

        public final EnumC4005a b() {
            return this.f44968b;
        }

        public final C6854a c() {
            return this.f44969c;
        }

        public final ViewContext d() {
            return this.f44970d;
        }
    }

    /* renamed from: d5.c$b */
    public static final class b extends AbstractC4007c {

        /* renamed from: b, reason: collision with root package name */
        public final EnumC4005a f44971b;

        /* renamed from: c, reason: collision with root package name */
        public final C6854a f44972c;

        /* renamed from: d, reason: collision with root package name */
        public final ViewContext f44973d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC4005a direction, C6854a touchCoordinates, ViewContext viewContext) {
            super("swipe", null);
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(touchCoordinates, "touchCoordinates");
            this.f44971b = direction;
            this.f44972c = touchCoordinates;
            this.f44973d = viewContext;
        }

        public final EnumC4005a b() {
            return this.f44971b;
        }

        public final C6854a c() {
            return this.f44972c;
        }

        public final ViewContext d() {
            return this.f44973d;
        }
    }

    /* renamed from: d5.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0652c extends AbstractC4007c {

        /* renamed from: b, reason: collision with root package name */
        public final C6854a f44974b;

        /* renamed from: d5.c$c$a */
        public static final class a extends AbstractC0652c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6854a tapCoordinates) {
                super("click", tapCoordinates, null);
                Intrinsics.checkNotNullParameter(tapCoordinates, "tapCoordinates");
            }
        }

        /* renamed from: d5.c$c$b */
        public static final class b extends AbstractC0652c {

            /* renamed from: c, reason: collision with root package name */
            public final ViewContext f44975c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C6854a tapCoordinates, ViewContext viewContext) {
                super("down", tapCoordinates, null);
                Intrinsics.checkNotNullParameter(tapCoordinates, "tapCoordinates");
                Intrinsics.checkNotNullParameter(viewContext, "viewContext");
                this.f44975c = viewContext;
            }

            public final ViewContext c() {
                return this.f44975c;
            }
        }

        public /* synthetic */ AbstractC0652c(String str, C6854a c6854a, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, c6854a);
        }

        public final C6854a b() {
            return this.f44974b;
        }

        public AbstractC0652c(String str, C6854a c6854a) {
            super(str, null);
            this.f44974b = c6854a;
        }
    }

    public /* synthetic */ AbstractC4007c(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f44967a;
    }

    public AbstractC4007c(String str) {
        this.f44967a = str;
    }
}

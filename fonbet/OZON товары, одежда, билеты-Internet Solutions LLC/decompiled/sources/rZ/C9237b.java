package rZ;

import EZ.e;
import EZ.g;
import EZ.i;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9011c;
import qZ.InterfaceC9014f;
import sZ.c;
import xZ.j;

/* renamed from: rZ.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9237b<FragmentType extends ComponentCallbacksC5392m> extends f {

    @NotNull
    private final d<? extends EZ.a<?>> navigator;

    @NotNull
    private final c<FragmentType> redirect;
    private final Integer requestCode;

    @NotNull
    private final c<C9011c> root;

    @NotNull
    private final InterfaceC9014f tag;

    /* renamed from: rZ.b$a */
    public static final class a extends i<C9237b<?>> {
        @Override // EZ.a
        public final void navigate(@NotNull g navigator, @NotNull e<C9237b<?>> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            Integer requestCode = response.b().getRequestCode();
            int intValue = requestCode != null ? requestCode.intValue() : 0;
            if (navigator instanceof j) {
                ((j) navigator).navigate(response, intValue);
            } else {
                next(navigator, response, intValue);
            }
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull g navigator, @NotNull e<C9237b<?>> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            Integer requestCode = response.b().getRequestCode();
            if (requestCode != null) {
                i11 = requestCode.intValue();
            }
            if (navigator instanceof j) {
                ((j) navigator).navigate(response, i11);
            } else {
                next(navigator, response, i11);
            }
        }
    }

    public /* synthetic */ C9237b(Integer num, InterfaceC9014f interfaceC9014f, c cVar, c cVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, interfaceC9014f, cVar, cVar2);
    }

    @Override // pZ.f
    @NotNull
    public d<? extends EZ.a<?>> getNavigator() {
        return this.navigator;
    }

    @NotNull
    public final c<FragmentType> getRedirect() {
        return this.redirect;
    }

    public final Integer getRequestCode() {
        return this.requestCode;
    }

    @NotNull
    public final c<C9011c> getRoot() {
        return this.root;
    }

    @NotNull
    public final InterfaceC9014f getTag() {
        return this.tag;
    }

    @NotNull
    public String toString() {
        return "FlowDestination(tag='" + this.tag + "', root=" + this.root + ", redirect=" + this.redirect + ")";
    }

    public C9237b(Integer num, @NotNull InterfaceC9014f tag, @NotNull c<C9011c> root, @NotNull c<FragmentType> redirect) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        this.requestCode = num;
        this.tag = tag;
        this.root = root;
        this.redirect = redirect;
        this.navigator = N.b(a.class);
    }
}

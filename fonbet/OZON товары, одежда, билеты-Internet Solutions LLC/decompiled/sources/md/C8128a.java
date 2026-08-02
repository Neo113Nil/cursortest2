package md;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.i;
import kotlin.reflect.m;
import nd.AbstractC8504A;
import nd.J0;
import nd.g1;
import od.h;
import org.jetbrains.annotations.NotNull;

/* renamed from: md.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8128a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(@NotNull J0 j02) {
        Intrinsics.checkNotNullParameter(j02, "<this>");
        if (j02 instanceof i) {
            Field a11 = C8130c.a(j02);
            if (!(a11 != null ? a11.isAccessible() : true)) {
                return false;
            }
            Intrinsics.checkNotNullParameter(j02, "<this>");
            Method b11 = C8130c.b(j02.getGetter());
            if (!(b11 != null ? b11.isAccessible() : true)) {
                return false;
            }
            i iVar = (i) j02;
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            Method b12 = C8130c.b(iVar.getSetter());
            if (!(b12 != null ? b12.isAccessible() : true)) {
                return false;
            }
        } else {
            Field a12 = C8130c.a(j02);
            if (!(a12 != null ? a12.isAccessible() : true)) {
                return false;
            }
            Intrinsics.checkNotNullParameter(j02, "<this>");
            Method b13 = C8130c.b(j02.getGetter());
            if (!(b13 != null ? b13.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final void b(@NotNull kotlin.reflect.c<?> cVar, boolean z11) {
        h<?> o11;
        h<?> r11;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof i) {
            m mVar = (m) cVar;
            Field a11 = C8130c.a(mVar);
            if (a11 != null) {
                a11.setAccessible(z11);
            }
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Method b11 = C8130c.b(mVar.getGetter());
            if (b11 != null) {
                b11.setAccessible(z11);
            }
            i iVar = (i) cVar;
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            Method b12 = C8130c.b(iVar.getSetter());
            if (b12 != null) {
                b12.setAccessible(z11);
                return;
            }
            return;
        }
        if (cVar instanceof m) {
            m mVar2 = (m) cVar;
            Field a12 = C8130c.a(mVar2);
            if (a12 != null) {
                a12.setAccessible(z11);
            }
            Intrinsics.checkNotNullParameter(mVar2, "<this>");
            Method b13 = C8130c.b(mVar2.getGetter());
            if (b13 != null) {
                b13.setAccessible(z11);
                return;
            }
            return;
        }
        if (cVar instanceof m.b) {
            Field a13 = C8130c.a(((m.b) cVar).b());
            if (a13 != null) {
                a13.setAccessible(z11);
            }
            Method b14 = C8130c.b((kotlin.reflect.h) cVar);
            if (b14 != null) {
                b14.setAccessible(z11);
                return;
            }
            return;
        }
        if (cVar instanceof i.a) {
            Field a14 = C8130c.a(((i.a) cVar).b());
            if (a14 != null) {
                a14.setAccessible(z11);
            }
            Method b15 = C8130c.b((kotlin.reflect.h) cVar);
            if (b15 != null) {
                b15.setAccessible(z11);
                return;
            }
            return;
        }
        if (!(cVar instanceof kotlin.reflect.h)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
        kotlin.reflect.h hVar = (kotlin.reflect.h) cVar;
        Method b16 = C8130c.b(hVar);
        if (b16 != null) {
            b16.setAccessible(z11);
        }
        AbstractC8504A a15 = g1.a(cVar);
        Object b17 = (a15 == null || (r11 = a15.r()) == null) ? null : r11.b();
        AccessibleObject accessibleObject = b17 instanceof AccessibleObject ? (AccessibleObject) b17 : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        AbstractC8504A a16 = g1.a(hVar);
        Object b18 = (a16 == null || (o11 = a16.o()) == null) ? null : o11.b();
        Constructor constructor = b18 instanceof Constructor ? (Constructor) b18 : null;
        if (constructor != null) {
            constructor.setAccessible(z11);
        }
    }
}

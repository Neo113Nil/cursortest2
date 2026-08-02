package ru.ozon.android.messenger.framework.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.domain.f;

/* loaded from: classes10.dex */
public final class d {
    @NotNull
    public static final ru.ozon.android.messenger.framework.core.viewmapper.a<?, ru.ozon.android.messenger.framework.presentation.models.g, X4.a> a(@NotNull b bVar, int i11) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b11 = bVar.b(i11);
        if (b11 != null) {
            Iterator<T> it = b11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                ru.ozon.android.messenger.framework.core.viewmapper.d dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj2;
                if ((dVar instanceof ru.ozon.android.messenger.framework.core.viewmapper.a ? (ru.ozon.android.messenger.framework.core.viewmapper.a) dVar : null) != null) {
                    break;
                }
            }
            obj = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj2;
        } else {
            obj = null;
        }
        ru.ozon.android.messenger.framework.core.viewmapper.a<?, ru.ozon.android.messenger.framework.presentation.models.g, X4.a> aVar = obj instanceof ru.ozon.android.messenger.framework.core.viewmapper.a ? (ru.ozon.android.messenger.framework.core.viewmapper.a) obj : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Unable to cast to BlockViewMapper");
    }

    @NotNull
    public static final ArrayList b(@NotNull b bVar, int i11) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b11 = bVar.b(i11);
        if (b11 != null) {
            arrayList = new ArrayList();
            for (Object obj : b11) {
                ru.ozon.android.messenger.framework.core.viewmapper.d dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj;
                if ((dVar instanceof ru.ozon.android.messenger.framework.core.viewmapper.a ? (ru.ozon.android.messenger.framework.core.viewmapper.a) dVar : null) != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList != null ? arrayList : null;
        if (arrayList2 != null) {
            return arrayList2;
        }
        throw new IllegalStateException("Unable to cast to BlockViewMapper");
    }

    @NotNull
    public static final ru.ozon.android.messenger.framework.core.viewmapper.b<Object, ru.ozon.android.messenger.framework.presentation.models.g, ?> c(@NotNull b bVar, int i11) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b11 = bVar.b(i11);
        if (b11 != null) {
            Iterator<T> it = b11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                ru.ozon.android.messenger.framework.core.viewmapper.d dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj2;
                if ((dVar instanceof ru.ozon.android.messenger.framework.core.viewmapper.b ? (ru.ozon.android.messenger.framework.core.viewmapper.b) dVar : null) != null) {
                    break;
                }
            }
            obj = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj2;
        } else {
            obj = null;
        }
        ru.ozon.android.messenger.framework.core.viewmapper.b<Object, ru.ozon.android.messenger.framework.presentation.models.g, ?> bVar2 = obj instanceof ru.ozon.android.messenger.framework.core.viewmapper.b ? (ru.ozon.android.messenger.framework.core.viewmapper.b) obj : null;
        if (bVar2 != null) {
            return bVar2;
        }
        throw new Exception(Ej.b.a(i11, "There is no WidgetViewMapper for NoUiViewType: "));
    }

    @NotNull
    public static final ru.ozon.android.messenger.framework.core.viewmapper.b<Object, ru.ozon.android.messenger.framework.presentation.models.g, ?> d(@NotNull b bVar, @NotNull ru.ozon.android.messenger.framework.presentation.models.e block) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b11 = bVar.b(block.d());
        if (b11 != null) {
            Iterator<T> it = b11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                ru.ozon.android.messenger.framework.core.viewmapper.d dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj2;
                if ((dVar instanceof ru.ozon.android.messenger.framework.core.viewmapper.b ? (ru.ozon.android.messenger.framework.core.viewmapper.b) dVar : null) != null && ((ru.ozon.android.messenger.framework.core.viewmapper.b) dVar).canMap(block)) {
                    break;
                }
            }
            obj = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj2;
        } else {
            obj = null;
        }
        ru.ozon.android.messenger.framework.core.viewmapper.b<Object, ru.ozon.android.messenger.framework.presentation.models.g, ?> bVar2 = obj instanceof ru.ozon.android.messenger.framework.core.viewmapper.b ? (ru.ozon.android.messenger.framework.core.viewmapper.b) obj : null;
        if (bVar2 != null) {
            return bVar2;
        }
        throw new Exception(Ej.b.a(block.d(), "There is no WidgetViewMapper for NoUiViewType: "));
    }

    @NotNull
    public static final ru.ozon.android.messenger.framework.core.viewmapper.a<?, ru.ozon.android.messenger.framework.presentation.models.g, X4.a> e(@NotNull b bVar, int i11, @NotNull Function0<Unit> action) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b11 = bVar.b(i11);
        if (b11 != null) {
            Iterator<T> it = b11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                ru.ozon.android.messenger.framework.core.viewmapper.d dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj2;
                if ((dVar instanceof ru.ozon.android.messenger.framework.core.viewmapper.a ? (ru.ozon.android.messenger.framework.core.viewmapper.a) dVar : null) != null) {
                    break;
                }
            }
            obj = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj2;
        } else {
            obj = null;
        }
        ru.ozon.android.messenger.framework.core.viewmapper.a<?, ru.ozon.android.messenger.framework.presentation.models.g, X4.a> aVar = obj instanceof ru.ozon.android.messenger.framework.core.viewmapper.a ? (ru.ozon.android.messenger.framework.core.viewmapper.a) obj : null;
        if (aVar != null) {
            return aVar;
        }
        action.invoke();
        String name = f.b.STUB.b();
        Intrinsics.checkNotNullParameter("internal", "vertical");
        Intrinsics.checkNotNullParameter(name, "name");
        Object c11 = bVar.c("internal." + name);
        Intrinsics.g(c11, "null cannot be cast to non-null type ru.ozon.android.messenger.framework.core.viewmapper.BlockViewMapper<*, ru.ozon.android.messenger.framework.presentation.models.BlockVO, androidx.viewbinding.ViewBinding>");
        return (ru.ozon.android.messenger.framework.core.viewmapper.a) c11;
    }

    public static final ru.ozon.android.messenger.blocks.chat.common.h<?, ru.ozon.android.messenger.framework.presentation.models.g> f(@NotNull b bVar, int i11, @NotNull Function0<Unit> action) {
        ru.ozon.android.messenger.framework.core.viewmapper.d dVar;
        Object obj;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b11 = bVar.b(i11);
        if (b11 != null) {
            Iterator<T> it = b11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ru.ozon.android.messenger.framework.core.viewmapper.d dVar2 = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj;
                if ((dVar2 instanceof ru.ozon.android.messenger.blocks.chat.common.h ? (ru.ozon.android.messenger.blocks.chat.common.h) dVar2 : null) != null) {
                    break;
                }
            }
            dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj;
        } else {
            dVar = null;
        }
        ru.ozon.android.messenger.blocks.chat.common.h<?, ru.ozon.android.messenger.framework.presentation.models.g> hVar = dVar instanceof ru.ozon.android.messenger.blocks.chat.common.h ? (ru.ozon.android.messenger.blocks.chat.common.h) dVar : null;
        if (hVar != null) {
            return hVar;
        }
        action.invoke();
        String name = f.b.STUB.b();
        Intrinsics.checkNotNullParameter("internal", "vertical");
        Intrinsics.checkNotNullParameter(name, "name");
        Object c11 = bVar.c("internal." + name);
        if (c11 instanceof ru.ozon.android.messenger.blocks.chat.common.h) {
            return (ru.ozon.android.messenger.blocks.chat.common.h) c11;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r2 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(b bVar, ru.ozon.android.messenger.framework.domain.f blockType) {
        Object obj;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(blockType, "blockType");
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c11 = bVar.c(blockType.a());
        if (c11 != null) {
            Iterator<T> it = c11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7705l.l(((ru.ozon.android.messenger.framework.core.viewmapper.d) obj).getSupportedVersions(), 1L)) {
                    break;
                }
            }
        }
        c11 = null;
        return bVar.a(c11);
    }
}

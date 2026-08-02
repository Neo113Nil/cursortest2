package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item;

import Ci.C2779a;
import Ci.b;
import Ci.g;
import Ci.k;
import Ci.l;
import d00.C6018d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewHolder.OnlyImageGalleryFilter;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f²\u0006\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\nX\u008a\u0084\u0002"}, d2 = {"Ld00/d;", "", "", "itemViewMapper", "(Ld00/d;)V", "LCi/k;", "", "isSelect", "", "maxCount", "modifyConfig", "(LCi/k;ZI)LCi/k;", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "photos", "creation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemViewMapperKt {
    public static final void itemViewMapper(@NotNull C6018d<Object> c6018d) {
        Intrinsics.checkNotNullParameter(c6018d, "<this>");
        c6018d.p(ItemViewMapperKt$itemViewMapper$1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k modifyConfig(k kVar, boolean z11, int i11) {
        return k.a(kVar, z11 ? R.style.OzonGallerySelectTheme : R.style.OzonGalleryTheme, OnlyImageGalleryFilter.INSTANCE, b.a(C2779a.b().d(), g.a(C2779a.b().d().f(), null, null, i11 == 1 ? l.RESULT_API_ONLY : kVar.d().f().g(), 31), null, i11, 1916), null, null, 114);
    }
}

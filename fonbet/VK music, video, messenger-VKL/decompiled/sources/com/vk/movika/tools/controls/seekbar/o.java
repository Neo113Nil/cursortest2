package com.vk.movika.tools.controls.seekbar;

import android.content.Context;
import android.widget.ImageView;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.owners.dto.OwnersGetContentTabsResponseDto;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragmentInternalComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bv6;
import xsna.c54;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.frv0;
import xsna.g2v;
import xsna.ggh;
import xsna.k4b;
import xsna.luo;
import xsna.ov70;
import xsna.r3i;
import xsna.rrv0;
import xsna.s3q0;
import xsna.vqt;
import xsna.wuv0;
import xsna.wzs;
import xsna.zal0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ o(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Clips.ContentTabCollection contentTabCollection;
        GroupContentTabSetting.GroupContentTabSpecialValues groupContentTabSpecialValues;
        List<GroupContentTabSetting.GroupContentTabCollection> list;
        Object obj4;
        r3 = null;
        Integer num = null;
        switch (this.b) {
            case 0:
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                return Integer.valueOf(epx.h(((a0) obj).a, ((a0) obj2).a));
            case 1:
                return new AttachedClipsFragmentInternalComponent((c54) obj2);
            case 2:
                ImageView imageView = (ImageView) obj;
                VkCell.f fVar = (VkCell.f) obj2;
                k4b.a aVar2 = fVar instanceof k4b.a ? (k4b.a) fVar : null;
                if (aVar2 != null) {
                    imageView.setImageResource(aVar2.a);
                }
                return s3q0.a;
            case 3:
                return (vqt) obj;
            case 4:
                bv6 bv6Var = (bv6) obj;
                Iterator it = r3i.c((OwnersGetContentTabsResponseDto) ((bv6) obj2).a).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (((GroupContentTabSetting) obj3).b == GroupContentTabType.SHORT_VIDEOS) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                GroupContentTabSetting groupContentTabSetting = (GroupContentTabSetting) obj3;
                if (groupContentTabSetting == null || (list = groupContentTabSetting.g) == null) {
                    contentTabCollection = null;
                } else {
                    List<GroupContentTabSetting.GroupContentTabCollection> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Clips.a.c((GroupContentTabSetting.GroupContentTabCollection) it2.next()));
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj4 = it3.next();
                            if (((Clips.ContentTabCollection) obj4).a == Clips.ContentTabCollection.ContentTabCollectionType.SCHEDULED) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    contentTabCollection = (Clips.ContentTabCollection) obj4;
                }
                if (groupContentTabSetting != null && (groupContentTabSpecialValues = groupContentTabSetting.h) != null) {
                    num = groupContentTabSpecialValues.b;
                }
                return new ggh.a((GroupsGetContentForTabsResponseDto) bv6Var.a, null, null, contentTabCollection, num);
            case 5:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1918065384, intValue, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$1918065384.<anonymous> (Composition.kt:917)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 6:
                return ((Float) obj).floatValue() > ((Float) obj2).floatValue() ? luo.a : luo.d;
            case 7:
                ov70 ov70Var = (ov70) obj2;
                return ov70Var != null ? ov70.c(ov70Var.a, 9205357640488583168L) : false ? Boolean.FALSE : e43.a(Float.valueOf(Float.intBitsToFloat((int) (ov70Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (ov70Var.a & 4294967295L))));
            case 8:
                ((Boolean) obj2).booleanValue();
                return s3q0.a;
            case 9:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar4.K(-758534730);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-758534730, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:255)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.o1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var;
            default:
                ((VkModal) obj).a();
                zal0.e(g2v.d().a(), (Context) obj2, null, null, 30);
                return s3q0.a;
        }
    }
}

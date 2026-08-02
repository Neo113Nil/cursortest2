package com.vk.movika.sdk.base.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.gifts.dto.GiftsCatalogGiftDto;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.api.generated.groups.dto.GroupsGetAddressesResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.config.authors.impl.di.ClipsConfigAuthorsComponentBase;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.imageloader.view.VKImageView;
import com.vk.toggle.b;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.c5g;
import xsna.d260;
import xsna.e3m;
import xsna.e43;
import xsna.e520;
import xsna.f4m;
import xsna.fz5;
import xsna.guf;
import xsna.it80;
import xsna.izs;
import xsna.j5g;
import xsna.k4g0;
import xsna.k9x;
import xsna.lce;
import xsna.mcr0;
import xsna.oq;
import xsna.pvw0;
import xsna.qcy;
import xsna.qgi0;
import xsna.rbj;
import xsna.s101;
import xsna.s3q0;
import xsna.sa30;
import xsna.scf0;
import xsna.t2s;
import xsna.tgi0;
import xsna.tlo0;
import xsna.ttf;
import xsna.x8j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(d.c((com.vk.movika.sdk.base.model.f) obj));
            case 1:
                return s3q0.a;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                if (s101.q(bitmap)) {
                    return q.T(bitmap);
                }
                Context context = e43.a;
                return mcr0.g((context != null ? context : null).getResources(), R.drawable.placeholder_song_96);
            case 3:
                return (AttachWithImage) ((AttachForMediaViewer) obj);
            case 4:
                qgi0.r((tgi0) obj, "catalog_banner_ad_free_sub_dismiss__test_tag");
                return s3q0.a;
            case 5:
                ((pvw0) obj).o();
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((Group) obj).D);
            case 7:
                return new scf0(0);
            case 8:
                return s3q0.a;
            case 9:
                qgi0.r((tgi0) obj, "checkout_form_field_subhead");
                return s3q0.a;
            case 10:
                b.a aVar = (b.a) obj;
                qcy<Object>[] qcyVarArr = ClipsConfigAuthorsComponentBase.f;
                return aVar;
            case 11:
                int i = lce.r;
                f4m.z(i, i, (VKImageView) obj);
                return s3q0.a;
            case 12:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new e520(R.id.grid_more_menu_action_report, R.drawable.vk_icon_report_outline_28, R.string.report_content, 0, false, 0, 0, false, null, 0, null, false, 8176));
                if (((UsersUserFullDto) j5g.Y((List) obj)).k() == BaseBoolIntDto.NO) {
                    arrayList.add(new e520(R.id.grid_more_menu_action_block, R.drawable.vk_icon_block_outline_28, R.string.block, 1, false, 0, 0, false, null, 0, null, false, 8176));
                } else {
                    arrayList.add(new e520(R.id.grid_more_menu_action_unblock, R.drawable.vk_icon_remove_circle_outline_28, R.string.unblock, 1, false, 0, 0, false, null, 0, null, false, 8176));
                }
                return arrayList;
            case 13:
                return Boolean.valueOf(d260.b.a().d1());
            case 14:
                return new ttf.j.b(((guf) obj).a);
            case 15:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(0, 100, 1)));
            case 16:
                return s3q0.a;
            case 17:
                it80.a aVar2 = it80.b;
                List<GroupsAddressDto> d = ((GroupsGetAddressesResponseDto) obj).d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList2.add(fz5.v((GroupsAddressDto) it.next()));
                }
                Object a0 = j5g.a0(arrayList2);
                aVar2.getClass();
                return new it80(a0);
            case 18:
                return k4g0.a((k4g0) obj, true, false, 3967);
            case 19:
                x8j x8jVar = (x8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new rbj(x8jVar.c, x8jVar.a, SortOrder.BY_NAME, x8jVar.d, true, null, 384);
            case 20:
                return Boolean.valueOf(((UploadImageModel) obj).d() == null);
            case 21:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_invite_link, (Context) obj);
            case 22:
                return DraftsListState.a((DraftsListState) obj, null, DraftsListState.LoadingState.LOADING_INITIAL, 0, false, false, 59);
            case 23:
                return s3q0.a;
            case 24:
                t2s t2sVar = (t2s) obj;
                return t2s.a(t2sVar, null, false, null, null, false, null, null, false, t2sVar.i + 1, 255);
            case 25:
                Context context2 = (Context) obj;
                VkFormField vkFormField = new VkFormField(context2, null, 6);
                VkTextArea vkTextArea = new VkTextArea(context2, null, 6);
                vkTextArea.setMiddle(new VkTextArea.d(12, oq.d(tlo0.Companion, ""), new tlo0.h("Placeholder")));
                vkFormField.addView(vkTextArea, new FrameLayout.LayoutParams(-1, -2));
                return vkFormField;
            case 26:
                VkUserStack vkUserStack = new VkUserStack((Context) obj, null, 6);
                vkUserStack.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                vkUserStack.setSize(VkUserStack.Size.Large);
                return vkUserStack;
            case 27:
                Integer num = (Integer) obj;
                return Boolean.valueOf(num != null && num.intValue() == BaseBoolIntDto.YES.i());
            case 28:
                return (GiftsCatalogGiftDto) ((List) obj).get(0);
            default:
                return s3q0.a;
        }
    }
}

package ru.ozon.app.android.returns.actionModal.di;

import Sc.o;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d00.C6020f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.returns.actionModal.presentation.viewObject.ReturnActionModalVO;
import ru.ozon.app.android.returns.actionModal.viewMapper.update.MarkRequiredFields;
import ru.ozon.app.android.returns.actionModal.viewMapper.update.PhotoUrlsUpdated;
import ru.ozon.app.android.returns.actionModal.viewMapper.update.TextUpdated;
import ru.ozon.app.android.returns.ui.data.components.Component;
import ru.ozon.app.android.returns.ui.data.components.RmsImageLocation;
import ru.ozon.app.android.returns.ui.data.components.RmsInputDto;
import ru.ozon.app.android.returns.ui.data.components.RmsTextAreaDto;
import ru.ozon.app.android.returns.ui.data.components.RmsUploadPhotosDto;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a;\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0013\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018*\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001a\u001a)\u0010\u001d\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a)\u0010\u001f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0012\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"¨\u0006'²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002²\u0006\f\u0010&\u001a\u00020%8\nX\u008a\u0084\u0002"}, d2 = {"Ln20/i;", "ReturnActionModalWidget", "()Ln20/i;", "", "message", "Landroid/view/ViewGroup;", "rootView", "", "icon", "Lru/ozon/uni/core/UniColors;", "iconTintColors", "Landroidx/lifecycle/J;", "viewOwner", "", "showMessage", "(Ljava/lang/String;Landroid/view/ViewGroup;ILru/ozon/uni/core/UniColors;Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "Lru/ozon/app/android/returns/actionModal/viewMapper/update/TextUpdated;", "updateKey", "updateText", "(Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;Lru/ozon/app/android/returns/actionModal/viewMapper/update/TextUpdated;)Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "Lru/ozon/app/android/returns/actionModal/viewMapper/update/PhotoUrlsUpdated;", "updatePhotoUrls", "(Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;Lru/ozon/app/android/returns/actionModal/viewMapper/update/PhotoUrlsUpdated;)Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "", "getUrls", "(Lru/ozon/app/android/returns/actionModal/viewMapper/update/PhotoUrlsUpdated;)Ljava/util/List;", "Lru/ozon/app/android/returns/ui/data/components/RmsImageLocation;", "getImageLocations", "showMessageRestriction", "(Landroid/view/ViewGroup;Landroidx/lifecycle/J;Ljava/lang/String;)V", "showErrorRestriction", "Lru/ozon/app/android/returns/actionModal/viewMapper/update/MarkRequiredFields;", "updateRequiredFields", "(Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;Lru/ozon/app/android/returns/actionModal/viewMapper/update/MarkRequiredFields;)Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "Lru/ozon/app/android/returns/actionModal/di/ReturnActionModalComposeComponent;", "component", "Lru/ozon/app/android/uploadPhotos/model/ViewState;", "photosState", "details_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnActionModalWidgetKt {
    @NotNull
    public static final i ReturnActionModalWidget() {
        return C6020f.b("rms", "returnActionModal", null, ReturnActionModalWidgetKt$ReturnActionModalWidget$1.INSTANCE, 4, null);
    }

    private static final List<RmsImageLocation> getImageLocations(PhotoUrlsUpdated photoUrlsUpdated) {
        ArrayList arrayList;
        List<AttachmentVO.AttachedImageVO> newAttachment = photoUrlsUpdated.getNewAttachment();
        if (newAttachment != null) {
            ArrayList<AttachmentVO.AttachedImageVO> arrayList2 = new ArrayList();
            for (Object obj : newAttachment) {
                AttachmentVO.AttachedImageVO attachedImageVO = (AttachmentVO.AttachedImageVO) obj;
                if (attachedImageVO.getBucket() != null && attachedImageVO.getKey() != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(C7714v.z(arrayList2, 10));
            for (AttachmentVO.AttachedImageVO attachedImageVO2 : arrayList2) {
                arrayList.add(new RmsImageLocation(attachedImageVO2.getBucket(), attachedImageVO2.getKey()));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? K.f71697a : arrayList;
    }

    private static final List<String> getUrls(PhotoUrlsUpdated photoUrlsUpdated) {
        ArrayList arrayList;
        List<AttachmentVO.AttachedImageVO> newAttachment = photoUrlsUpdated.getNewAttachment();
        if (newAttachment != null) {
            arrayList = new ArrayList();
            Iterator<T> it = newAttachment.iterator();
            while (it.hasNext()) {
                String url = ((AttachmentVO.AttachedImageVO) it.next()).getUrl();
                if (url != null) {
                    arrayList.add(url);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? K.f71697a : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showErrorRestriction(ViewGroup viewGroup, J j11, String str) {
        if (viewGroup == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, viewGroup, null, OzonSpannableStringKt.toOzonSpannableString(str), null, null, null, j11, 58, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessage(String str, ViewGroup viewGroup, int i11, UniColors uniColors, J j11) {
        if (str == null || h.K(str)) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, viewGroup, null, OzonSpannableStringKt.toOzonSpannableString(str), null, null, Integer.valueOf(i11), null, uniColors.getToken(), null, null, null, null, null, 3000L, null, null, j11, 57178, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessageRestriction(ViewGroup viewGroup, J j11, String str) {
        if (viewGroup == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, viewGroup, null, OzonSpannableStringKt.toOzonSpannableString(str), null, null, null, null, null, null, null, null, null, null, null, null, null, j11, 65530, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReturnActionModalVO updatePhotoUrls(ReturnActionModalVO returnActionModalVO, PhotoUrlsUpdated photoUrlsUpdated) {
        ArrayList arrayList;
        ReturnActionModalVO copy;
        List<ReturnActionModalVO.ActionComponent> components = returnActionModalVO.getComponents();
        if (components != null) {
            List<ReturnActionModalVO.ActionComponent> list = components;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (ReturnActionModalVO.ActionComponent actionComponent : list) {
                if (actionComponent.getComponent() instanceof RmsUploadPhotosDto) {
                    actionComponent = ReturnActionModalVO.ActionComponent.copy$default(actionComponent, null, null, null, false, null, RmsUploadPhotosDto.copy$default((RmsUploadPhotosDto) actionComponent.getComponent(), false, null, null, getUrls(photoUrlsUpdated), getImageLocations(photoUrlsUpdated), null, 39, null), 23, null);
                }
                arrayList.add(actionComponent);
            }
        } else {
            arrayList = null;
        }
        copy = returnActionModalVO.copy((r27 & 1) != 0 ? returnActionModalVO.id : 0L, (r27 & 2) != 0 ? returnActionModalVO.returnNumber : null, (r27 & 4) != 0 ? returnActionModalVO.action : null, (r27 & 8) != 0 ? returnActionModalVO.title : null, (r27 & 16) != 0 ? returnActionModalVO.subtitle : null, (r27 & 32) != 0 ? returnActionModalVO.tabs : null, (r27 & 64) != 0 ? returnActionModalVO.hint : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? returnActionModalVO.photos : null, (r27 & 256) != 0 ? returnActionModalVO.components : arrayList, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? returnActionModalVO.submitButton : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? returnActionModalVO.cancelButton : null, (r27 & 2048) != 0 ? returnActionModalVO.extraValues : null);
        return copy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReturnActionModalVO updateRequiredFields(ReturnActionModalVO returnActionModalVO, MarkRequiredFields markRequiredFields) {
        ArrayList arrayList;
        ReturnActionModalVO copy;
        List<ReturnActionModalVO.ActionComponent> components = returnActionModalVO.getComponents();
        if (components != null) {
            List<ReturnActionModalVO.ActionComponent> list = components;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (ReturnActionModalVO.ActionComponent actionComponent : list) {
                if (!actionComponent.getShowRequireError() && markRequiredFields.getKeys().contains(actionComponent.getKey())) {
                    actionComponent = ReturnActionModalVO.ActionComponent.copy$default(actionComponent, null, null, null, true, null, null, 55, null);
                } else if (actionComponent.getShowRequireError() && !markRequiredFields.getKeys().contains(actionComponent.getKey())) {
                    actionComponent = ReturnActionModalVO.ActionComponent.copy$default(actionComponent, null, null, null, false, null, null, 55, null);
                }
                arrayList.add(actionComponent);
            }
        } else {
            arrayList = null;
        }
        copy = returnActionModalVO.copy((r27 & 1) != 0 ? returnActionModalVO.id : 0L, (r27 & 2) != 0 ? returnActionModalVO.returnNumber : null, (r27 & 4) != 0 ? returnActionModalVO.action : null, (r27 & 8) != 0 ? returnActionModalVO.title : null, (r27 & 16) != 0 ? returnActionModalVO.subtitle : null, (r27 & 32) != 0 ? returnActionModalVO.tabs : null, (r27 & 64) != 0 ? returnActionModalVO.hint : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? returnActionModalVO.photos : null, (r27 & 256) != 0 ? returnActionModalVO.components : arrayList, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? returnActionModalVO.submitButton : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? returnActionModalVO.cancelButton : null, (r27 & 2048) != 0 ? returnActionModalVO.extraValues : null);
        return copy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReturnActionModalVO updateText(ReturnActionModalVO returnActionModalVO, TextUpdated textUpdated) {
        ArrayList arrayList;
        ReturnActionModalVO copy;
        List<ReturnActionModalVO.ActionComponent> components = returnActionModalVO.getComponents();
        if (components != null) {
            List<ReturnActionModalVO.ActionComponent> list = components;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (ReturnActionModalVO.ActionComponent actionComponent : list) {
                if (Intrinsics.d(actionComponent.getKey(), textUpdated.getKey())) {
                    Component component = actionComponent.getComponent();
                    if (component instanceof RmsUploadPhotosDto) {
                        continue;
                    } else if (component instanceof RmsTextAreaDto) {
                        actionComponent = ReturnActionModalVO.ActionComponent.copy$default(actionComponent, null, null, null, false, null, RmsTextAreaDto.copy$default((RmsTextAreaDto) component, false, null, textUpdated.getNewText(), null, null, 27, null), 23, null);
                    } else {
                        if (!(component instanceof RmsInputDto)) {
                            throw new o();
                        }
                        actionComponent = ReturnActionModalVO.ActionComponent.copy$default(actionComponent, null, null, null, false, null, RmsInputDto.copy$default((RmsInputDto) component, false, null, textUpdated.getNewText(), null, null, null, 59, null), 23, null);
                    }
                }
                arrayList.add(actionComponent);
            }
        } else {
            arrayList = null;
        }
        copy = returnActionModalVO.copy((r27 & 1) != 0 ? returnActionModalVO.id : 0L, (r27 & 2) != 0 ? returnActionModalVO.returnNumber : null, (r27 & 4) != 0 ? returnActionModalVO.action : null, (r27 & 8) != 0 ? returnActionModalVO.title : null, (r27 & 16) != 0 ? returnActionModalVO.subtitle : null, (r27 & 32) != 0 ? returnActionModalVO.tabs : null, (r27 & 64) != 0 ? returnActionModalVO.hint : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? returnActionModalVO.photos : null, (r27 & 256) != 0 ? returnActionModalVO.components : arrayList, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? returnActionModalVO.submitButton : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? returnActionModalVO.cancelButton : null, (r27 & 2048) != 0 ? returnActionModalVO.extraValues : null);
        return copy;
    }
}

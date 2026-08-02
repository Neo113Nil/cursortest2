package ec0;

import Ae.C2406m0;
import Ae.InterfaceC2397i;
import Jb0.n;
import Sc.s;
import android.widget.LinearLayout;
import fc0.C6497a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.accountMerge.data.UserInfoDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.accountMerge.presentation.OzonIdAccountMergeFragment$observeViewModel$lambda$5$lambda$4$$inlined$collectFlow$1", f = "OzonIdAccountMergeFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f62119d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2406m0 f62120e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f62121f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n f62122g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f62123a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f62124b;

        public a(h hVar, n nVar) {
            this.f62123a = hVar;
            this.f62124b = nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x020b  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            EntryDTO.SubmitButtonDTO c11;
            OzonSpannableString ozonSpannableString;
            C6497a c6497a = (C6497a) t2;
            h hVar = this.f62123a;
            n nVar = this.f62124b;
            TextAtomV2View titleTextAtomView = nVar.f14517e;
            Intrinsics.checkNotNullExpressionValue(titleTextAtomView, "titleTextAtomView");
            TextHolderKt.bind$default(titleTextAtomView, new TextDTO(OzonSpannableStringKt.toOzonSpannableString(c6497a.getTitle()), null, null, null, null, null, TextPreset.UI_H1, null, null, null, null, null, null, false, null, null, null, null, Integer.MAX_VALUE, 262078, null), null, 2, null);
            String a11 = c6497a.a();
            TextDTO textDTO = (a11 == null || (ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(a11)) == null) ? null : new TextDTO(ozonSpannableString, TextDTO.TextAlignment.LEADING, null, null, null, null, TextPreset.PARAGRAPH_COMPACT, null, UniColors.TEXT_SECONDARY.getToken(), null, null, null, null, false, null, null, null, null, Integer.MAX_VALUE, 261820, null);
            TextAtomV2View descriptionTextAtomView = nVar.f14514b;
            Intrinsics.checkNotNullExpressionValue(descriptionTextAtomView, "descriptionTextAtomView");
            TextHolderKt.bindOrGone$default(descriptionTextAtomView, textDTO, null, 2, null);
            UserInfoDTO d11 = c6497a.d();
            Image userImage = nVar.f14518f;
            TextAtomV2View userMail = nVar.f14519g;
            TextAtomV2View userPhone = nVar.f14521i;
            TextAtomV2View userName = nVar.f14520h;
            if (d11 != null) {
                String picture = d11.getPicture();
                if (!(picture == null || picture.length() == 0)) {
                    UserInfoDTO d12 = c6497a.d();
                    String picture2 = d12.getPicture();
                    if (picture2 != null) {
                        Intrinsics.checkNotNullExpressionValue(userImage, "userImage");
                        ImageHolderKt.bind$default(userImage, new ImageDTO(picture2, null, null, false, null, null, CommonCellSettings.LayoutPadding.NONE, null, CornerRadius.RADIUS_550, null, null, null, null, null, null, null, 65214, null), null, 2, null);
                    }
                    String name = d12.getName();
                    if (name != null) {
                        Intrinsics.checkNotNullExpressionValue(userName, "userName");
                        TextHolderKt.bind$default(userName, new TextDTO(OzonSpannableStringKt.toOzonSpannableString(name), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.COMPACT_500_MEDIUM.getToken(), UniColors.TEXT_PRIMARY.getToken(), null, null, null, null, false, null, null, null, null, null, 523838, null), null, 2, null);
                        Intrinsics.checkNotNullExpressionValue(userName, "userName");
                        userName.setPadding(0, 0, 0, 0);
                    }
                    String phone = d12.getPhone();
                    if (phone != null) {
                        Intrinsics.checkNotNullExpressionValue(userPhone, "userPhone");
                        TextHolderKt.bind$default(userPhone, new TextDTO(OzonSpannableStringKt.toOzonSpannableString(phone), TextDTO.TextAlignment.LEADING, null, null, null, null, TextPreset.PARAGRAPH_COMPACT, null, UniColors.TEXT_SECONDARY.getToken(), null, null, null, null, false, null, null, null, null, null, 523964, null), null, 2, null);
                        Intrinsics.checkNotNullExpressionValue(userPhone, "userPhone");
                        userPhone.setPadding(0, 0, 0, 0);
                    }
                    String email = d12.getEmail();
                    if (email != null) {
                        Intrinsics.checkNotNullExpressionValue(userMail, "userMail");
                        TextHolderKt.bind$default(userMail, new TextDTO(OzonSpannableStringKt.toOzonSpannableString(email), TextDTO.TextAlignment.LEADING, null, null, null, null, TextPreset.PARAGRAPH_COMPACT, null, UniColors.TEXT_SECONDARY.getToken(), null, null, null, null, false, null, null, null, null, null, 523964, null), null, 2, null);
                        Intrinsics.checkNotNullExpressionValue(userMail, "userMail");
                        userMail.setPadding(0, 0, 0, 0);
                    }
                    LinearLayout hintButtonsLinearLayout = nVar.f14515c;
                    Intrinsics.checkNotNullExpressionValue(hintButtonsLinearLayout, "hintButtonsLinearLayout");
                    cc0.c.a(hintButtonsLinearLayout, c6497a.b(), new C6343a(hVar), null, 4);
                    c11 = c6497a.c();
                    if (c11 != null) {
                        ButtonV3View submitButton = nVar.f14516d;
                        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
                        ButtonV3HolderKt.bindOrGone$default(submitButton, new ButtonV3DTO(null, ButtonV3DTO.Sizes.SIZE_600, c11.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262137, null), null, 2, null);
                        submitButton.setOnClickListener(new Eb0.a(3, hVar, c11));
                    }
                    return Unit.f71690a;
                }
            }
            Intrinsics.checkNotNullExpressionValue(userImage, "userImage");
            ViewExtKt.gone(userImage);
            Intrinsics.checkNotNullExpressionValue(userName, "userName");
            ViewExtKt.gone(userName);
            Intrinsics.checkNotNullExpressionValue(userPhone, "userPhone");
            ViewExtKt.gone(userPhone);
            Intrinsics.checkNotNullExpressionValue(userMail, "userMail");
            ViewExtKt.gone(userMail);
            LinearLayout hintButtonsLinearLayout2 = nVar.f14515c;
            Intrinsics.checkNotNullExpressionValue(hintButtonsLinearLayout2, "hintButtonsLinearLayout");
            cc0.c.a(hintButtonsLinearLayout2, c6497a.b(), new C6343a(hVar), null, 4);
            c11 = c6497a.c();
            if (c11 != null) {
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C2406m0 c2406m0, kotlin.coroutines.d dVar, h hVar, n nVar) {
        super(2, dVar);
        this.f62120e = c2406m0;
        this.f62121f = hVar;
        this.f62122g = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f62120e, dVar, this.f62121f, this.f62122g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f62119d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f62121f, this.f62122g);
            this.f62119d = 1;
            if (this.f62120e.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}

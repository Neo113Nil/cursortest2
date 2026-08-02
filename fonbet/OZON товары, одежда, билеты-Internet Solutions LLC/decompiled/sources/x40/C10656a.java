package x40;

import C.J;
import E30.i;
import Sc.o;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.detmir.recycli.adapters.ScrollKeeper;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oa.C8678a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.action.Cbottom2Action;
import ru.ozon.fintech.features.cbottombase.models.action.Cbottom2SharingAction;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2FullDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2ModalDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2OnboardingDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2OnboardingV2DTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2PdfDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2ScreenDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SheetDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SnackDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2StoriesDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.AnimatedCircleProgressDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.BoxV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.CheckBoxV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.ColumnV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinButtonV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinButtonV22DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinImageV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinInputDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinLottieV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FlexRowV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.HorizontalProgressV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.LabelV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.LazyColumnDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.LazyRowV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.PinProgressDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.RadioV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.RoundProgressV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.RowV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextAreaV22DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextFieldV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextItemV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.ToggleV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapperState;
import ru.ozon.fintech.ui.box20.BoxV20State;
import ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20State;
import ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22State;
import ru.ozon.fintech.ui.checkbox.CheckBoxWrapperState;
import ru.ozon.fintech.ui.columnV20.ColumnV20State;
import ru.ozon.fintech.ui.imageV20.FinImageV20State;
import ru.ozon.fintech.ui.input.FinInputState;
import ru.ozon.fintech.ui.labelV20.LabelV20WrapperState;
import ru.ozon.fintech.ui.lazycolumn.LazyColumnState;
import ru.ozon.fintech.ui.lottieV20.LottieV20State;
import ru.ozon.fintech.ui.pinprogress.PinProgressWrapperState;
import ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20State;
import ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20State;
import ru.ozon.fintech.ui.radioV20.RadioWrapperV20State;
import ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20State;
import ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20State;
import ru.ozon.fintech.ui.rowV20.RowV20State;
import ru.ozon.fintech.ui.textareaV22.TextAreaV22State;
import ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperState;
import ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperState;
import ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperState;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import t40.C9753c;
import t40.C9755e;
import t40.EnumC9751a;
import t40.EnumC9752b;
import t40.EnumC9754d;

/* renamed from: x40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10656a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f105023a;

    /* renamed from: x40.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2274a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105024a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f105025b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f105026c;

        static {
            int[] iArr = new int[CbottomElement2.values().length];
            try {
                iArr[CbottomElement2.TEXTATOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CbottomElement2.LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CbottomElement2.TEXTFIELD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CbottomElement2.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CbottomElement2.BUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CbottomElement2.BUTTONV2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CbottomElement2.BOX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CbottomElement2.ROW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CbottomElement2.COLUMN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CbottomElement2.LOTTIE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CbottomElement2.LAZYROW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CbottomElement2.FLEXROW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CbottomElement2.HORIZONTALPROGRESS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CbottomElement2.ROUNDPROGRESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CbottomElement2.CHECKBOX.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CbottomElement2.RADIO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CbottomElement2.TOGGLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CbottomElement2.TEXTAREA.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CbottomElement2.INPUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CbottomElement2.PINPROGRESS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CbottomElement2.ANIMATEDCIRCLEPROGRESS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CbottomElement2.LAZYCOLUMN.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f105024a = iArr;
            int[] iArr2 = new int[Cbottom2Action.Type.values().length];
            try {
                iArr2[Cbottom2Action.Type.SHARE_FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            f105025b = iArr2;
            int[] iArr3 = new int[CbottomType.values().length];
            try {
                iArr3[CbottomType.SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[CbottomType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[CbottomType.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[CbottomType.ONBOARDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[CbottomType.MODAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[CbottomType.SNACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[CbottomType.WEBVIEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[CbottomType.STORIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[CbottomType.PDF.ordinal()] = 9;
            } catch (NoSuchFieldError unused32) {
            }
            f105026c = iArr3;
        }
    }

    public C10656a(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f105023a = moshi;
    }

    private static Common a(String str, F40.a aVar, Function1 function1) {
        String str2;
        GradientDrawable.Orientation orientation;
        ArrayList arrayList;
        GradientDrawable.Orientation orientation2;
        GradientDrawable.Orientation orientation3;
        String str3;
        int i11;
        String id2 = aVar.getId();
        Integer version = aVar.getVersion();
        Boolean clickable = aVar.getClickable();
        Boolean touchDown = aVar.getTouchDown();
        Boolean skeletonable = aVar.getSkeletonable();
        Boolean disableHighlightAnimation = aVar.getDisableHighlightAnimation();
        Integer width = aVar.getWidth();
        Integer height = aVar.getHeight();
        Integer ratioW = aVar.getRatioW();
        Integer ratioH = aVar.getRatioH();
        Float percentW = aVar.getPercentW();
        Rect b11 = i.b(aVar.getMargins());
        List<EnumC9752b> layoutGravity = aVar.getLayoutGravity();
        if (layoutGravity == null || layoutGravity.size() != 2) {
            str2 = id2;
            orientation = null;
            arrayList = null;
        } else {
            List<EnumC9752b> list = layoutGravity;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            Iterator it = list.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                EnumC9752b enumC9752b = (EnumC9752b) next;
                Iterator it2 = it;
                EnumC9752b enumC9752b2 = EnumC9752b.START;
                if (enumC9752b == enumC9752b2 && i12 == 0) {
                    i11 = 8388611;
                    str3 = id2;
                } else {
                    str3 = id2;
                    if (enumC9752b == enumC9752b2 && i12 == 1) {
                        i11 = 48;
                    } else {
                        EnumC9752b enumC9752b3 = EnumC9752b.END;
                        if (enumC9752b == enumC9752b3 && i12 == 0) {
                            i11 = 8388613;
                        } else if (enumC9752b == enumC9752b3 && i12 == 1) {
                            i11 = 80;
                        } else {
                            EnumC9752b enumC9752b4 = EnumC9752b.CENTER;
                            if (enumC9752b == enumC9752b4 && i12 == 0) {
                                i11 = 1;
                            } else {
                                if (enumC9752b != enumC9752b4 || i12 != 1) {
                                    throw new Exception("Gravity can be only " + EnumC9752b.a());
                                }
                                i11 = 16;
                            }
                        }
                    }
                }
                arrayList2.add(Integer.valueOf(i11));
                it = it2;
                i12 = i13;
                id2 = str3;
            }
            str2 = id2;
            orientation = null;
            arrayList = arrayList2;
        }
        Float layoutWeight = aVar.getLayoutWeight();
        Rect b12 = i.b(aVar.getPaddings());
        GradientDrawable.Orientation orientation4 = orientation;
        List<Integer> backgroundRadius = aVar.getBackgroundRadius();
        String str4 = str2;
        String backgroundColor = aVar.getBackgroundColor();
        List<String> backgroundGradient = aVar.getBackgroundGradient();
        EnumC9751a backgroundGradientOrientation = aVar.getBackgroundGradientOrientation();
        if (backgroundGradientOrientation != null) {
            if (backgroundGradientOrientation == EnumC9751a.TOP_BOTTOM) {
                orientation2 = GradientDrawable.Orientation.TOP_BOTTOM;
            } else if (backgroundGradientOrientation == EnumC9751a.LEFT_RIGHT) {
                orientation2 = GradientDrawable.Orientation.LEFT_RIGHT;
            }
            orientation3 = orientation2;
            return new Common(str, str4, version, clickable, touchDown, skeletonable, disableHighlightAnimation, function1, width, height, ratioW, ratioH, percentW, b11, arrayList, layoutWeight, b12, backgroundRadius, backgroundColor, backgroundGradient, orientation3, aVar.getStrokeColor(), aVar.getStrokeWidth(), aVar.getDashWidth(), aVar.getDashGap(), aVar.getElevation(), aVar.getAlpha(), aVar.isHidden(), aVar.getComposerActionBehavior(), aVar.getComposerActionLink(), aVar.getComposerActionId(), aVar.getComposerActionParams(), aVar.getComposerTrackingInfo());
        }
        orientation3 = orientation4;
        return new Common(str, str4, version, clickable, touchDown, skeletonable, disableHighlightAnimation, function1, width, height, ratioW, ratioH, percentW, b11, arrayList, layoutWeight, b12, backgroundRadius, backgroundColor, backgroundGradient, orientation3, aVar.getStrokeColor(), aVar.getStrokeWidth(), aVar.getDashWidth(), aVar.getDashGap(), aVar.getElevation(), aVar.getAlpha(), aVar.isHidden(), aVar.getComposerActionBehavior(), aVar.getComposerActionLink(), aVar.getComposerActionId(), aVar.getComposerActionParams(), aVar.getComposerTrackingInfo());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [ru.ozon.fintech.ui.imageV20.FinImageV20State] */
    /* JADX WARN: Type inference failed for: r6v16, types: [ru.ozon.fintech.ui.labelV20.LabelV20WrapperState] */
    /* JADX WARN: Type inference failed for: r7v104 */
    /* JADX WARN: Type inference failed for: r7v105 */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v109 */
    /* JADX WARN: Type inference failed for: r7v110 */
    /* JADX WARN: Type inference failed for: r7v111 */
    /* JADX WARN: Type inference failed for: r7v112 */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29, types: [ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20State] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35, types: [ru.ozon.fintech.ui.box20.BoxV20State] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v38, types: [ru.ozon.fintech.ui.rowV20.RowV20State] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v41, types: [ru.ozon.fintech.ui.columnV20.ColumnV20State] */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v44, types: [ru.ozon.fintech.ui.lottieV20.LottieV20State] */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v59, types: [ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20State] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v62, types: [ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20State] */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v65, types: [ru.ozon.fintech.ui.checkbox.CheckBoxWrapperState] */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v68, types: [ru.ozon.fintech.ui.radioV20.RadioWrapperV20State] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v71, types: [ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperState] */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v74, types: [ru.ozon.fintech.ui.textareaV22.TextAreaV22State] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v77, types: [ru.ozon.fintech.ui.input.FinInputState] */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v80, types: [ru.ozon.fintech.ui.pinprogress.PinProgressWrapperState] */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v83, types: [ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapperState] */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r7v87, types: [ru.ozon.fintech.ui.lazycolumn.LazyColumnState] */
    /* JADX WARN: Type inference failed for: r7v94 */
    /* JADX WARN: Type inference failed for: r7v96 */
    /* JADX WARN: Type inference failed for: r7v97 */
    /* JADX WARN: Type inference failed for: r7v98 */
    /* JADX WARN: Type inference failed for: r7v99 */
    /* JADX WARN: Type inference failed for: r8v10, types: [ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20State] */
    /* JADX WARN: Type inference failed for: r8v16, types: [ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20State] */
    /* JADX WARN: Type inference failed for: r8v4, types: [ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperState] */
    /* JADX WARN: Type inference failed for: r8v7, types: [ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22State] */
    @NotNull
    public static ArrayList b(@NotNull String cbottomId, List list, @NotNull Function1 actionListener, ScrollKeeper.a aVar) {
        Gravity gravity;
        TextAtomV20WrapperState textAtomV20WrapperState;
        Intrinsics.checkNotNullParameter(cbottomId, "cbottomId");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                F40.a aVar2 = (F40.a) it.next();
                if (!Intrinsics.d(aVar2.isHidden(), Boolean.TRUE)) {
                    TextAtomV20WrapperState textAtomV20WrapperState2 = null;
                    ?? r72 = 0;
                    ?? r73 = 0;
                    ?? r74 = 0;
                    ?? r75 = 0;
                    ?? r76 = 0;
                    ?? r77 = 0;
                    ?? r78 = 0;
                    ?? r79 = 0;
                    ?? r710 = 0;
                    ?? r711 = 0;
                    Integer num = null;
                    TextAtomV20WrapperState textAtomV20WrapperState3 = null;
                    TextAtomV20WrapperState textAtomV20WrapperState4 = null;
                    ?? r712 = 0;
                    ?? r713 = 0;
                    ?? r714 = 0;
                    ?? r715 = 0;
                    TextAtomV20WrapperState textAtomV20WrapperState5 = null;
                    ?? r716 = 0;
                    r7 = null;
                    ImageView.ScaleType scaleType = null;
                    TextAtomV20WrapperState textAtomV20WrapperState6 = null;
                    TextAtomV20WrapperState textAtomV20WrapperState7 = null;
                    TextAtomV20WrapperState textAtomV20WrapperState8 = null;
                    switch (C2274a.f105024a[aVar2.getType().ordinal()]) {
                        case 1:
                            TextItemV20DTO textItemV20DTO = aVar2 instanceof TextItemV20DTO ? (TextItemV20DTO) aVar2 : null;
                            if (textItemV20DTO != null) {
                                try {
                                    String upperCase = textItemV20DTO.getGravity().toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    gravity = Gravity.valueOf(upperCase);
                                } catch (Exception unused) {
                                    gravity = Gravity.START;
                                }
                                if (!C7714v.A(CbottomElement2.TEXTATOM.getVersions(), textItemV20DTO.getVersion())) {
                                    throw new Exception(J.b(textItemV20DTO.getVersion(), "Cant display TEXTATOM with version "));
                                }
                                Common a11 = a(cbottomId, textItemV20DTO, actionListener);
                                Intrinsics.checkNotNullParameter(textItemV20DTO, "<this>");
                                OzonHtmlParser.Companion companion = OzonHtmlParser.INSTANCE;
                                String text = textItemV20DTO.getText();
                                OzonSpannableString ozonSpannableString = new OzonSpannableString(OzonHtmlParser.Companion.parseHtml$default(companion, text != null ? text : "", 0, 2, null));
                                String textStyle = textItemV20DTO.getTextStyle();
                                if (textStyle == null) {
                                    textStyle = StyleParser.TextStyle.BODY_M.getStyleName();
                                }
                                String str = textStyle;
                                String textColor = textItemV20DTO.getTextColor();
                                if (textColor == null) {
                                    textColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue();
                                }
                                textAtomV20WrapperState2 = new TextAtomV20WrapperState(a11, new TextAtom(ozonSpannableString, str, textColor, textItemV20DTO.getMaxLines(), null, null, null, 112, null), gravity, TextUtils.TruncateAt.END);
                            }
                            Unit unit = Unit.f71690a;
                            textAtomV20WrapperState = textAtomV20WrapperState2;
                            break;
                        case 2:
                            LabelV20DTO labelV20DTO = aVar2 instanceof LabelV20DTO ? (LabelV20DTO) aVar2 : null;
                            if (labelV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.LABEL.getVersions(), labelV20DTO.getVersion())) {
                                    throw new Exception(J.b(labelV20DTO.getVersion(), "Cant display LABEL with version "));
                                }
                                Common a12 = a(cbottomId, labelV20DTO, actionListener);
                                Intrinsics.checkNotNullParameter(labelV20DTO, "<this>");
                                OzonHtmlParser.Companion companion2 = OzonHtmlParser.INSTANCE;
                                String text2 = labelV20DTO.getText();
                                OzonSpannableString ozonSpannableString2 = new OzonSpannableString(OzonHtmlParser.Companion.parseHtml$default(companion2, text2 != null ? text2 : "", 0, 2, null));
                                TextDTO.TextAlignment textAlignment = labelV20DTO.getTextAlignment();
                                CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.NONE;
                                TextPreset textPreset = TextPreset.PRESET_CUSTOM;
                                String typographyToken = labelV20DTO.getTypographyToken();
                                String textColor2 = labelV20DTO.getTextColor();
                                CommonAtomLabelDTO.TruncatingMode truncatingMode = labelV20DTO.getTruncatingMode();
                                String icon = labelV20DTO.getIcon();
                                String iconTintColor = labelV20DTO.getIconTintColor();
                                CommonAtomLabelDTO.IconPosition iconPosition = labelV20DTO.getIconPosition();
                                Integer maxLines = labelV20DTO.getMaxLines();
                                textAtomV20WrapperState8 = new LabelV20WrapperState(a12, new TextDTO(ozonSpannableString2, textAlignment, layoutPadding, layoutPadding, layoutPadding, layoutPadding, textPreset, typographyToken, textColor2, null, null, null, null, true, truncatingMode, icon, iconTintColor, iconPosition, Integer.valueOf(maxLines != null ? maxLines.intValue() : 0), 7168, null));
                            }
                            Unit unit2 = Unit.f71690a;
                            textAtomV20WrapperState = textAtomV20WrapperState8;
                            break;
                        case 3:
                            TextFieldV20DTO textFieldV20DTO = aVar2 instanceof TextFieldV20DTO ? (TextFieldV20DTO) aVar2 : null;
                            if (textFieldV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.TEXTFIELD.getVersions(), textFieldV20DTO.getVersion())) {
                                    throw new Exception(J.b(textFieldV20DTO.getVersion(), "Cant display TEXTFIELD with version "));
                                }
                                Common a13 = a(cbottomId, textFieldV20DTO, actionListener);
                                TextFieldV20DTO.b textFieldPreset = textFieldV20DTO.getTextFieldPreset();
                                textAtomV20WrapperState7 = new TextFieldV20WrapperState(a13, textFieldV20DTO.getInputState(), textFieldV20DTO.getInputStatus(), textFieldV20DTO.getInputKeyboardType(), textFieldV20DTO.getInputKeyboardAction(), textFieldPreset != null ? textFieldPreset.a() : null, textFieldV20DTO.getInputTitle(), textFieldV20DTO.getInputValue(), textFieldV20DTO.getLabelText(), textFieldV20DTO.getLabelTextColor(), textFieldV20DTO.getLabelIcon(), textFieldV20DTO.getLabelIconColor(), textFieldV20DTO.getLabelIconPosition(), textFieldV20DTO.isInputCopyEnabled(), textFieldV20DTO.isInputResetEnabled(), textFieldV20DTO.isInputProtected(), textFieldV20DTO.getVersionStamp());
                            }
                            Unit unit3 = Unit.f71690a;
                            textAtomV20WrapperState = textAtomV20WrapperState7;
                            break;
                        case 4:
                            FinImageV20DTO finImageV20DTO = aVar2 instanceof FinImageV20DTO ? (FinImageV20DTO) aVar2 : null;
                            if (finImageV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.IMAGE.getVersions(), finImageV20DTO.getVersion())) {
                                    throw new Exception(J.b(finImageV20DTO.getVersion(), "Cant display IMAGE with version "));
                                }
                                Common a14 = a(cbottomId, finImageV20DTO, actionListener);
                                String iconSrc = finImageV20DTO.getIconSrc();
                                String icon2 = finImageV20DTO.getIcon();
                                String iconBase64 = finImageV20DTO.getIconBase64();
                                String iconColor = finImageV20DTO.getIconColor();
                                EnumC9754d scaleType2 = finImageV20DTO.getScaleType();
                                if (scaleType2 != null) {
                                    int i11 = C9755e.f99168a[scaleType2.ordinal()];
                                    if (i11 == 1) {
                                        scaleType = ImageView.ScaleType.CENTER;
                                    } else if (i11 == 2) {
                                        scaleType = ImageView.ScaleType.FIT_CENTER;
                                    } else if (i11 == 3) {
                                        scaleType = ImageView.ScaleType.CENTER_CROP;
                                    }
                                }
                                textAtomV20WrapperState6 = new FinImageV20State(a14, iconSrc, icon2, iconBase64, iconColor, scaleType);
                            }
                            Unit unit4 = Unit.f71690a;
                            textAtomV20WrapperState = textAtomV20WrapperState6;
                            break;
                        case 5:
                            FinButtonV20DTO finButtonV20DTO = aVar2 instanceof FinButtonV20DTO ? (FinButtonV20DTO) aVar2 : null;
                            if (finButtonV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.BUTTON.getVersions(), finButtonV20DTO.getVersion())) {
                                    throw new Exception(J.b(finButtonV20DTO.getVersion(), "Cant display BUTTON with version "));
                                }
                                Common a15 = a(cbottomId, finButtonV20DTO, actionListener);
                                FinButtonV20DTO.INSTANCE.getClass();
                                Intrinsics.checkNotNullParameter(finButtonV20DTO, "<this>");
                                r716 = new ButtonAtomWrapperV20State(a15, new ButtonDTO(finButtonV20DTO.getPreset(), finButtonV20DTO.getStyle(), finButtonV20DTO.isEnabled(), finButtonV20DTO.getTitle(), finButtonV20DTO.getSubtitle(), finButtonV20DTO.getCommon()));
                            }
                            Unit unit5 = Unit.f71690a;
                            textAtomV20WrapperState = r716;
                            break;
                        case 6:
                            FinButtonV22DTO finButtonV22DTO = aVar2 instanceof FinButtonV22DTO ? (FinButtonV22DTO) aVar2 : null;
                            if (finButtonV22DTO != null) {
                                if (!C7714v.A(CbottomElement2.BUTTONV2.getVersions(), finButtonV22DTO.getVersion())) {
                                    throw new Exception(J.b(finButtonV22DTO.getVersion(), "Cant display BUTTON with version "));
                                }
                                Common a16 = a(cbottomId, finButtonV22DTO.getStyle() == ButtonV3DTO.StyleTypes.CUSTOM ? finButtonV22DTO.copy((r64 & 1) != 0 ? finButtonV22DTO.type : null, (r64 & 2) != 0 ? finButtonV22DTO.id : null, (r64 & 4) != 0 ? finButtonV22DTO.version : null, (r64 & 8) != 0 ? finButtonV22DTO.clickable : null, (r64 & 16) != 0 ? finButtonV22DTO.touchDown : null, (r64 & 32) != 0 ? finButtonV22DTO.skeletonable : null, (r64 & 64) != 0 ? finButtonV22DTO.disableHighlightAnimation : null, (r64 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? finButtonV22DTO.width : null, (r64 & 256) != 0 ? finButtonV22DTO.height : null, (r64 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? finButtonV22DTO.ratioW : null, (r64 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? finButtonV22DTO.ratioH : null, (r64 & 2048) != 0 ? finButtonV22DTO.percentW : null, (r64 & 4096) != 0 ? finButtonV22DTO.margins : null, (r64 & 8192) != 0 ? finButtonV22DTO.layoutGravity : null, (r64 & 16384) != 0 ? finButtonV22DTO.layoutWeight : null, (r64 & 32768) != 0 ? finButtonV22DTO.paddings : null, (r64 & 65536) != 0 ? finButtonV22DTO.backgroundRadius : null, (r64 & 131072) != 0 ? finButtonV22DTO.backgroundGradient : null, (r64 & 262144) != 0 ? finButtonV22DTO.backgroundGradientOrientation : null, (r64 & 524288) != 0 ? finButtonV22DTO.strokeColor : null, (r64 & 1048576) != 0 ? finButtonV22DTO.strokeWidth : null, (r64 & 2097152) != 0 ? finButtonV22DTO.dashWidth : null, (r64 & 4194304) != 0 ? finButtonV22DTO.dashGap : null, (r64 & 8388608) != 0 ? finButtonV22DTO.elevation : null, (r64 & 16777216) != 0 ? finButtonV22DTO.alpha : null, (r64 & 33554432) != 0 ? finButtonV22DTO.backgroundColor : null, (r64 & 67108864) != 0 ? finButtonV22DTO.isHidden : null, (r64 & 134217728) != 0 ? finButtonV22DTO.style : null, (r64 & 268435456) != 0 ? finButtonV22DTO.title : null, (r64 & 536870912) != 0 ? finButtonV22DTO.size : null, (r64 & 1073741824) != 0 ? finButtonV22DTO.subtitle : null, (r64 & LinearLayoutManager.INVALID_OFFSET) != 0 ? finButtonV22DTO.icon : null, (r65 & 1) != 0 ? finButtonV22DTO.dataText : null, (r65 & 2) != 0 ? finButtonV22DTO.isDisabled : null, (r65 & 4) != 0 ? finButtonV22DTO.isHoverDisabled : null, (r65 & 8) != 0 ? finButtonV22DTO.titleColor : null, (r65 & 16) != 0 ? finButtonV22DTO.subtitleColor : null, (r65 & 32) != 0 ? finButtonV22DTO.iconColor : null, (r65 & 64) != 0 ? finButtonV22DTO.dataTextColor : null, (r65 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? finButtonV22DTO.dataBackgroundColor : null, (r65 & 256) != 0 ? finButtonV22DTO.isLoading : false, (r65 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? finButtonV22DTO.composerActionBehavior : null, (r65 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? finButtonV22DTO.composerActionLink : null, (r65 & 2048) != 0 ? finButtonV22DTO.composerActionId : null, (r65 & 4096) != 0 ? finButtonV22DTO.composerActionParams : null, (r65 & 8192) != 0 ? finButtonV22DTO.composerTrackingInfo : null) : finButtonV22DTO, actionListener);
                                FinButtonV22DTO.INSTANCE.getClass();
                                Intrinsics.checkNotNullParameter(finButtonV22DTO, "<this>");
                                textAtomV20WrapperState5 = new ButtonAtomWrapperV22State(a16, new ButtonV3DTO(finButtonV22DTO.getStyle(), finButtonV22DTO.getSize(), finButtonV22DTO.getTitle(), finButtonV22DTO.getSubtitle(), finButtonV22DTO.getIcon(), finButtonV22DTO.getDataText(), finButtonV22DTO.isDisabled(), finButtonV22DTO.getTitleColor(), finButtonV22DTO.getDataTextColor(), finButtonV22DTO.getSubtitleColor(), finButtonV22DTO.getIconColor(), finButtonV22DTO.getDataBackgroundColor(), finButtonV22DTO.getBackgroundColor(), null, finButtonV22DTO.isHoverDisabled(), null, null, null, 237568, null), finButtonV22DTO.isLoading());
                            }
                            Unit unit6 = Unit.f71690a;
                            textAtomV20WrapperState = textAtomV20WrapperState5;
                            break;
                        case 7:
                            BoxV20DTO boxV20DTO = aVar2 instanceof BoxV20DTO ? (BoxV20DTO) aVar2 : null;
                            if (boxV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.BOX.getVersions(), boxV20DTO.getVersion())) {
                                    throw new Exception(J.b(boxV20DTO.getVersion(), "Cant display BOX with version "));
                                }
                                Common a17 = a(cbottomId, boxV20DTO, actionListener);
                                List<F40.a> widgets = boxV20DTO.getWidgets();
                                if (widgets == null) {
                                    widgets = K.f71697a;
                                }
                                r715 = new BoxV20State(a17, b(cbottomId, widgets, actionListener, aVar));
                            }
                            Unit unit7 = Unit.f71690a;
                            textAtomV20WrapperState = r715;
                            break;
                        case 8:
                            RowV20DTO rowV20DTO = aVar2 instanceof RowV20DTO ? (RowV20DTO) aVar2 : null;
                            if (rowV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.ROW.getVersions(), rowV20DTO.getVersion())) {
                                    throw new Exception(J.b(rowV20DTO.getVersion(), "Cant display ROW with version "));
                                }
                                Common a18 = a(cbottomId, rowV20DTO, actionListener);
                                List<F40.a> widgets2 = rowV20DTO.getWidgets();
                                if (widgets2 == null) {
                                    widgets2 = K.f71697a;
                                }
                                r714 = new RowV20State(a18, b(cbottomId, widgets2, actionListener, aVar));
                            }
                            Unit unit8 = Unit.f71690a;
                            textAtomV20WrapperState = r714;
                            break;
                        case 9:
                            ColumnV20DTO columnV20DTO = aVar2 instanceof ColumnV20DTO ? (ColumnV20DTO) aVar2 : null;
                            if (columnV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.COLUMN.getVersions(), columnV20DTO.getVersion())) {
                                    throw new Exception(J.b(columnV20DTO.getVersion(), "Cant display COLUMN with version "));
                                }
                                Common a19 = a(cbottomId, columnV20DTO, actionListener);
                                List<F40.a> widgets3 = columnV20DTO.getWidgets();
                                if (widgets3 == null) {
                                    widgets3 = K.f71697a;
                                }
                                r713 = new ColumnV20State(a19, b(cbottomId, widgets3, actionListener, aVar));
                            }
                            Unit unit9 = Unit.f71690a;
                            textAtomV20WrapperState = r713;
                            break;
                        case 10:
                            FinLottieV20DTO finLottieV20DTO = aVar2 instanceof FinLottieV20DTO ? (FinLottieV20DTO) aVar2 : null;
                            if (finLottieV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.LOTTIE.getVersions(), finLottieV20DTO.getVersion())) {
                                    throw new Exception(J.b(finLottieV20DTO.getVersion(), "Cant display LOTTIE with version "));
                                }
                                r712 = new LottieV20State(a(cbottomId, finLottieV20DTO, actionListener), finLottieV20DTO.getAnimation(), finLottieV20DTO.getInfinity());
                            }
                            Unit unit10 = Unit.f71690a;
                            textAtomV20WrapperState = r712;
                            break;
                        case 11:
                            LazyRowV20DTO lazyRowV20DTO = aVar2 instanceof LazyRowV20DTO ? (LazyRowV20DTO) aVar2 : null;
                            if (lazyRowV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.LAZYROW.getVersions(), lazyRowV20DTO.getVersion())) {
                                    throw new Exception(J.b(lazyRowV20DTO.getVersion(), "Cant display LAZYROW with version "));
                                }
                                Common a21 = a(cbottomId, lazyRowV20DTO, actionListener);
                                ScrollKeeper L11 = aVar != null ? aVar.L(lazyRowV20DTO.getId()) : null;
                                List<F40.a> widgets4 = lazyRowV20DTO.getWidgets();
                                if (widgets4 == null) {
                                    widgets4 = K.f71697a;
                                }
                                textAtomV20WrapperState4 = new LazyRowV20State(a21, L11, b(cbottomId, widgets4, actionListener, aVar), null, 8, null);
                            }
                            Unit unit11 = Unit.f71690a;
                            textAtomV20WrapperState = textAtomV20WrapperState4;
                            break;
                        case 12:
                            FlexRowV20DTO flexRowV20DTO = aVar2 instanceof FlexRowV20DTO ? (FlexRowV20DTO) aVar2 : null;
                            if (flexRowV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.FLEXROW.getVersions(), flexRowV20DTO.getVersion())) {
                                    throw new Exception(J.b(flexRowV20DTO.getVersion(), "Cant display FLEXROW with version "));
                                }
                                Common a22 = a(cbottomId, flexRowV20DTO, actionListener);
                                EnumC9752b alignment = flexRowV20DTO.getAlignment();
                                int i12 = alignment == null ? -1 : C9753c.f99167a[alignment.ordinal()];
                                if (i12 == 1) {
                                    num = 8388611;
                                } else if (i12 == 2) {
                                    num = 8388613;
                                } else if (i12 == 3) {
                                    num = 1;
                                }
                                List<F40.a> widgets5 = flexRowV20DTO.getWidgets();
                                if (widgets5 == null) {
                                    widgets5 = K.f71697a;
                                }
                                textAtomV20WrapperState3 = new FlexRowV20State(a22, b(cbottomId, widgets5, actionListener, aVar), num);
                            }
                            Unit unit12 = Unit.f71690a;
                            textAtomV20WrapperState = textAtomV20WrapperState3;
                            break;
                        case 13:
                            HorizontalProgressV20DTO horizontalProgressV20DTO = aVar2 instanceof HorizontalProgressV20DTO ? (HorizontalProgressV20DTO) aVar2 : null;
                            if (horizontalProgressV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.HORIZONTALPROGRESS.getVersions(), horizontalProgressV20DTO.getVersion())) {
                                    throw new Exception(J.b(horizontalProgressV20DTO.getVersion(), "Cant display HORIZONTALPROGRESS with version "));
                                }
                                r711 = new HorizontalProgressV20State(a(cbottomId, horizontalProgressV20DTO, actionListener), horizontalProgressV20DTO.getPercentage(), horizontalProgressV20DTO.getPercentColor(), horizontalProgressV20DTO.getPercentBackgroundColor(), horizontalProgressV20DTO.getProgressStrokeWidth());
                            }
                            Unit unit13 = Unit.f71690a;
                            textAtomV20WrapperState = r711;
                            break;
                        case 14:
                            RoundProgressV20DTO roundProgressV20DTO = aVar2 instanceof RoundProgressV20DTO ? (RoundProgressV20DTO) aVar2 : null;
                            if (roundProgressV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.ROUNDPROGRESS.getVersions(), roundProgressV20DTO.getVersion())) {
                                    throw new Exception(J.b(roundProgressV20DTO.getVersion(), "Cant display ROUNDPROGRESS with version "));
                                }
                                r710 = new RoundProgressV20State(a(cbottomId, roundProgressV20DTO, actionListener), roundProgressV20DTO.getPercentage(), roundProgressV20DTO.getPercentColor(), roundProgressV20DTO.getPercentBackgroundColor(), roundProgressV20DTO.getProgressStrokeWidth());
                            }
                            Unit unit14 = Unit.f71690a;
                            textAtomV20WrapperState = r710;
                            break;
                        case 15:
                            CheckBoxV20DTO checkBoxV20DTO = aVar2 instanceof CheckBoxV20DTO ? (CheckBoxV20DTO) aVar2 : null;
                            if (checkBoxV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.CHECKBOX.getVersions(), checkBoxV20DTO.getVersion())) {
                                    throw new Exception(J.b(checkBoxV20DTO.getVersion(), "Cant display CKECKBOX with version "));
                                }
                                Common a23 = a(cbottomId, checkBoxV20DTO, actionListener);
                                CheckBoxV20DTO.INSTANCE.getClass();
                                Intrinsics.checkNotNullParameter(checkBoxV20DTO, "<this>");
                                r79 = new CheckBoxWrapperState(a23, new CheckBoxDTO(checkBoxV20DTO.getSize(), checkBoxV20DTO.getStatus(), checkBoxV20DTO.getState(), null, null, null, null, null, null, null, 1016, null));
                            }
                            Unit unit15 = Unit.f71690a;
                            textAtomV20WrapperState = r79;
                            break;
                        case 16:
                            RadioV20DTO radioV20DTO = aVar2 instanceof RadioV20DTO ? (RadioV20DTO) aVar2 : null;
                            if (radioV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.RADIO.getVersions(), radioV20DTO.getVersion())) {
                                    throw new Exception(J.b(radioV20DTO.getVersion(), "Cant display RADIO with version "));
                                }
                                Common a24 = a(cbottomId, radioV20DTO, actionListener);
                                RadioV20DTO.INSTANCE.getClass();
                                Intrinsics.checkNotNullParameter(radioV20DTO, "<this>");
                                r78 = new RadioWrapperV20State(a24, new RadioDTO(radioV20DTO.getSize(), Boolean.valueOf(radioV20DTO.isSelected()), radioV20DTO.getState(), null, null, null, 56, null));
                            }
                            Unit unit16 = Unit.f71690a;
                            textAtomV20WrapperState = r78;
                            break;
                        case 17:
                            ToggleV20DTO toggleV20DTO = aVar2 instanceof ToggleV20DTO ? (ToggleV20DTO) aVar2 : null;
                            if (toggleV20DTO != null) {
                                if (!C7714v.A(CbottomElement2.TOGGLE.getVersions(), toggleV20DTO.getVersion())) {
                                    throw new Exception(J.b(toggleV20DTO.getVersion(), "Cant display TOGGLE with version "));
                                }
                                Common a25 = a(cbottomId, toggleV20DTO, actionListener);
                                ToggleV20DTO.INSTANCE.getClass();
                                Intrinsics.checkNotNullParameter(toggleV20DTO, "<this>");
                                r77 = new ToggleAtomWrapperState(a25, new ToggleDTO(Boolean.valueOf(toggleV20DTO.isSelected()), Boolean.valueOf(toggleV20DTO.isEnabled()), null, null, null, null, 60, null));
                            }
                            Unit unit17 = Unit.f71690a;
                            textAtomV20WrapperState = r77;
                            break;
                        case 18:
                            TextAreaV22DTO textAreaV22DTO = aVar2 instanceof TextAreaV22DTO ? (TextAreaV22DTO) aVar2 : null;
                            if (textAreaV22DTO != null) {
                                if (!C7714v.A(CbottomElement2.TEXTAREA.getVersions(), textAreaV22DTO.getVersion())) {
                                    throw new Exception(J.b(textAreaV22DTO.getVersion(), "Cant display TEXTAREA with version "));
                                }
                                r76 = new TextAreaV22State(a(cbottomId, textAreaV22DTO, actionListener), textAreaV22DTO.getValue(), textAreaV22DTO.getPlaceholder(), textAreaV22DTO.getCaption(), textAreaV22DTO.getCaptionColor(), textAreaV22DTO.getStatus(), textAreaV22DTO.getState(), textAreaV22DTO.getLabel(), textAreaV22DTO.getBottomBar(), textAreaV22DTO.getRows(), textAreaV22DTO.getCounter(), textAreaV22DTO.isResize(), textAreaV22DTO.getDisableClearButton(), textAreaV22DTO.getHasInfoIcon(), textAreaV22DTO.getVersionStamp());
                            }
                            Unit unit18 = Unit.f71690a;
                            textAtomV20WrapperState = r76;
                            break;
                        case 19:
                            FinInputDTO finInputDTO = aVar2 instanceof FinInputDTO ? (FinInputDTO) aVar2 : null;
                            if (finInputDTO != null) {
                                if (!C7714v.A(CbottomElement2.INPUT.getVersions(), finInputDTO.getVersion())) {
                                    throw new Exception(J.b(finInputDTO.getVersion(), "Cant display INPUT with version "));
                                }
                                r75 = new FinInputState(a(cbottomId, finInputDTO, actionListener), finInputDTO.getValue(), finInputDTO.getSize(), finInputDTO.getTheme(), finInputDTO.getPlaceholder(), finInputDTO.getCaption(), finInputDTO.getCaptionColor(), finInputDTO.getStatus(), finInputDTO.getState(), finInputDTO.getFirstIcon(), finInputDTO.getSecondIcon(), finInputDTO.getMaxLength(), finInputDTO.getLabel(), finInputDTO.getLabelPosition(), finInputDTO.getInputMask(), finInputDTO.getInputMode(), finInputDTO.getVersionStamp());
                            }
                            Unit unit19 = Unit.f71690a;
                            textAtomV20WrapperState = r75;
                            break;
                        case 20:
                            PinProgressDTO pinProgressDTO = aVar2 instanceof PinProgressDTO ? (PinProgressDTO) aVar2 : null;
                            if (pinProgressDTO != null) {
                                if (!C7714v.A(CbottomElement2.PINPROGRESS.getVersions(), pinProgressDTO.getVersion())) {
                                    throw new Exception(J.b(pinProgressDTO.getVersion(), "Cant display PINCODEPROGRESS with version "));
                                }
                                r74 = new PinProgressWrapperState(a(cbottomId, pinProgressDTO, actionListener), pinProgressDTO.getSelectedDot(), pinProgressDTO.getNormalColor(), pinProgressDTO.getSelectedColor(), pinProgressDTO.getErrorColor(), pinProgressDTO.getDotsCount(), pinProgressDTO.getDotRadius(), pinProgressDTO.getSelectedRadius());
                            }
                            Unit unit20 = Unit.f71690a;
                            textAtomV20WrapperState = r74;
                            break;
                        case 21:
                            AnimatedCircleProgressDTO animatedCircleProgressDTO = aVar2 instanceof AnimatedCircleProgressDTO ? (AnimatedCircleProgressDTO) aVar2 : null;
                            if (animatedCircleProgressDTO != null) {
                                if (!C7714v.A(CbottomElement2.ANIMATEDCIRCLEPROGRESS.getVersions(), animatedCircleProgressDTO.getVersion())) {
                                    throw new Exception(J.b(animatedCircleProgressDTO.getVersion(), "Cant display ANIMATEDCIRCLEPROGRESS with version "));
                                }
                                r73 = new AnimatedCircleProgressWrapperState(a(cbottomId, animatedCircleProgressDTO, actionListener), animatedCircleProgressDTO.getTintColor(), animatedCircleProgressDTO.getProgressStrokeWidth());
                            }
                            Unit unit21 = Unit.f71690a;
                            textAtomV20WrapperState = r73;
                            break;
                        case 22:
                            LazyColumnDTO lazyColumnDTO = aVar2 instanceof LazyColumnDTO ? (LazyColumnDTO) aVar2 : null;
                            if (lazyColumnDTO != null) {
                                if (!C7714v.A(CbottomElement2.LAZYCOLUMN.getVersions(), lazyColumnDTO.getVersion())) {
                                    throw new Exception(J.b(lazyColumnDTO.getVersion(), "Cant display LAZYCOLUMN with version "));
                                }
                                Common a26 = a(cbottomId, lazyColumnDTO, actionListener);
                                List<F40.a> widgets6 = lazyColumnDTO.getWidgets();
                                if (widgets6 == null) {
                                    widgets6 = K.f71697a;
                                }
                                r72 = new LazyColumnState(a26, b(cbottomId, widgets6, actionListener, aVar), lazyColumnDTO.getDragEnabled());
                            }
                            Unit unit22 = Unit.f71690a;
                            textAtomV20WrapperState = r72;
                            break;
                        default:
                            throw new o();
                    }
                    if (textAtomV20WrapperState != null) {
                        arrayList.add(textAtomV20WrapperState);
                    }
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final Cbottom2SharingAction c(String str) {
        String str2;
        Moshi moshi = this.f105023a;
        Intrinsics.checkNotNullParameter(moshi, "<this>");
        Intrinsics.checkNotNullParameter(Cbottom2Action.class, "type");
        if (str == null) {
            throw new Exception("Cant parse null json cbottom");
        }
        Cbottom2Action cbottom2Action = (Cbottom2Action) moshi.c(Cbottom2Action.class).fromJson(str);
        Cbottom2SharingAction cbottom2SharingAction = null;
        Cbottom2Action.Type name = cbottom2Action != null ? cbottom2Action.getName() : null;
        if ((name == null ? -1 : C2274a.f105025b[name.ordinal()]) == 1) {
            Intrinsics.g(cbottom2Action, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottombase.models.action.Cbottom2SharingAction");
            cbottom2SharingAction = (Cbottom2SharingAction) cbottom2Action;
            str2 = "Unknown Error parsing CBottom action";
        } else {
            str2 = "Unsupported cbottom action type";
        }
        if (cbottom2SharingAction != null) {
            return cbottom2SharingAction;
        }
        throw new Exception(str2);
    }

    @NotNull
    public final ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a d(String str) {
        int i11 = 1;
        Moshi moshi = this.f105023a;
        Intrinsics.checkNotNullParameter(moshi, "<this>");
        Intrinsics.checkNotNullParameter(ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a.class, "type");
        if (str == null) {
            throw new Exception("Cant parse null json cbottom");
        }
        ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a aVar = (ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a) moshi.c(ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a.class).fromJson(str);
        Xc.a<CbottomType> entries = CbottomType.getEntries();
        if (entries == null || !entries.isEmpty()) {
            for (CbottomType cbottomType : entries) {
                if (cbottomType == (aVar != null ? aVar.getType() : null) && C7714v.A(cbottomType.getVersions(), aVar.getVersion())) {
                    C8678a c8678a = new C8678a(i11);
                    switch (C2274a.f105026c[aVar.getType().ordinal()]) {
                        case 1:
                            Cbottom2SheetDTO cbottom2SheetDTO = (Cbottom2SheetDTO) aVar;
                            String id2 = cbottom2SheetDTO.getId();
                            List<F40.a> footer = cbottom2SheetDTO.getFooter();
                            if (footer == null) {
                                footer = K.f71697a;
                            }
                            List<F40.a> list = footer;
                            List<F40.a> main = cbottom2SheetDTO.getMain();
                            b(id2, C7714v.p0(main != null ? main : K.f71697a, list), c8678a, null);
                            return aVar;
                        case 2:
                            Cbottom2FullDTO cbottom2FullDTO = (Cbottom2FullDTO) aVar;
                            String id3 = cbottom2FullDTO.getId();
                            List<F40.a> header = cbottom2FullDTO.getHeader();
                            if (header == null) {
                                header = K.f71697a;
                            }
                            List<F40.a> list2 = header;
                            List<F40.a> footer2 = cbottom2FullDTO.getFooter();
                            ArrayList p02 = C7714v.p0(footer2 != null ? footer2 : K.f71697a, list2);
                            List<F40.a> main2 = cbottom2FullDTO.getMain();
                            b(id3, C7714v.p0(main2 != null ? main2 : K.f71697a, p02), c8678a, null);
                            return aVar;
                        case 3:
                            Cbottom2ScreenDTO cbottom2ScreenDTO = (Cbottom2ScreenDTO) aVar;
                            String id4 = cbottom2ScreenDTO.getId();
                            List<F40.a> header2 = cbottom2ScreenDTO.getHeader();
                            if (header2 == null) {
                                header2 = K.f71697a;
                            }
                            List<F40.a> list3 = header2;
                            List<F40.a> footer3 = cbottom2ScreenDTO.getFooter();
                            ArrayList p03 = C7714v.p0(footer3 != null ? footer3 : K.f71697a, list3);
                            List<F40.a> main3 = cbottom2ScreenDTO.getMain();
                            b(id4, C7714v.p0(main3 != null ? main3 : K.f71697a, p03), c8678a, null);
                            return aVar;
                        case 4:
                            ArrayList arrayList = new ArrayList();
                            Integer version = aVar.getVersion();
                            if (version != null && version.intValue() == 1) {
                                for (Cbottom2OnboardingDTO.FrameDTO frameDTO : ((Cbottom2OnboardingDTO) aVar).getFrames()) {
                                    List bottomWidgets = frameDTO.getBottomWidgets();
                                    arrayList.addAll(bottomWidgets != null ? bottomWidgets : K.f71697a);
                                    List topWidgets = frameDTO.getTopWidgets();
                                    arrayList.addAll(topWidgets != null ? topWidgets : K.f71697a);
                                }
                            } else {
                                for (Cbottom2OnboardingV2DTO.FrameDTO frameDTO2 : ((Cbottom2OnboardingV2DTO) aVar).getFrames()) {
                                    List header3 = frameDTO2.getHeader();
                                    arrayList.addAll(header3 != null ? header3 : K.f71697a);
                                    List main4 = frameDTO2.getMain();
                                    arrayList.addAll(main4 != null ? main4 : K.f71697a);
                                    List footer4 = frameDTO2.getFooter();
                                    arrayList.addAll(footer4 != null ? footer4 : K.f71697a);
                                }
                            }
                            b(aVar.getId(), arrayList, c8678a, null);
                            return aVar;
                        case 5:
                            Cbottom2ModalDTO cbottom2ModalDTO = (Cbottom2ModalDTO) aVar;
                            String id5 = cbottom2ModalDTO.getId();
                            List<F40.a> main5 = cbottom2ModalDTO.getMain();
                            if (main5 == null) {
                                main5 = K.f71697a;
                            }
                            b(id5, main5, c8678a, null);
                            return aVar;
                        case 6:
                            Cbottom2SnackDTO cbottom2SnackDTO = (Cbottom2SnackDTO) aVar;
                            String id6 = cbottom2SnackDTO.getId();
                            List<F40.a> main6 = cbottom2SnackDTO.getMain();
                            if (main6 == null) {
                                main6 = K.f71697a;
                            }
                            b(id6, main6, c8678a, null);
                            return aVar;
                        case 7:
                            Unit unit = Unit.f71690a;
                            return aVar;
                        case 8:
                            Cbottom2StoriesDTO cbottom2StoriesDTO = (Cbottom2StoriesDTO) aVar;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it = cbottom2StoriesDTO.getStories().iterator();
                            while (it.hasNext()) {
                                List<Cbottom2StoriesDTO.FrameDTO> frames = ((Cbottom2StoriesDTO.StoryDTO) it.next()).getFrames();
                                if (frames != null) {
                                    for (Cbottom2StoriesDTO.FrameDTO frameDTO3 : frames) {
                                        List bottomWidgets2 = frameDTO3.getBottomWidgets();
                                        arrayList2.addAll(bottomWidgets2 != null ? bottomWidgets2 : K.f71697a);
                                        List topWidgets2 = frameDTO3.getTopWidgets();
                                        arrayList2.addAll(topWidgets2 != null ? topWidgets2 : K.f71697a);
                                        List centerWidgets = frameDTO3.getCenterWidgets();
                                        arrayList2.addAll(centerWidgets != null ? centerWidgets : K.f71697a);
                                    }
                                }
                            }
                            b(cbottom2StoriesDTO.getId(), arrayList2, c8678a, null);
                            return aVar;
                        case 9:
                            Cbottom2PdfDTO cbottom2PdfDTO = (Cbottom2PdfDTO) aVar;
                            String id7 = cbottom2PdfDTO.getId();
                            List<F40.a> header4 = cbottom2PdfDTO.getHeader();
                            if (header4 == null) {
                                header4 = K.f71697a;
                            }
                            List<F40.a> list4 = header4;
                            List<F40.a> footer5 = cbottom2PdfDTO.getFooter();
                            ArrayList p04 = C7714v.p0(footer5 != null ? footer5 : K.f71697a, list4);
                            List<F40.a> main7 = cbottom2PdfDTO.getMain();
                            b(id7, C7714v.p0(main7 != null ? main7 : K.f71697a, p04), c8678a, null);
                            return aVar;
                        default:
                            throw new o();
                    }
                }
            }
        }
        throw new Exception("Cbottom type " + (aVar != null ? aVar.getType() : null) + " and version " + (aVar != null ? aVar.getVersion() : null) + " is unsupported");
    }

    @NotNull
    public final List<F40.a> e(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        JsonAdapter d11 = this.f105023a.d(D.e(List.class, F40.a.class));
        Intrinsics.checkNotNullExpressionValue(d11, "adapter(...)");
        List<F40.a> list = (List) d11.fromJson(json);
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Can't parse CbottomWidget2DTO from json ".concat(json));
    }
}

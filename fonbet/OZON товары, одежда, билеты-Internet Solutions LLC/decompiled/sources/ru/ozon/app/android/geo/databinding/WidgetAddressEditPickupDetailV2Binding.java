package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetAddressEditPickupDetailV2Binding implements a {

    @NonNull
    public final Barrier addressBarrier;

    @NonNull
    public final HorizontalAtomsLayout addressNameChipsHAL;

    @NonNull
    public final HorizontalScrollView addressNameChipsHSV;

    @NonNull
    public final TextInputEditText addressNameEt;

    @NonNull
    public final TextInputLayout addressNameTil;

    @NonNull
    public final RecyclerView addressRv;

    @NonNull
    public final VerticalAtomsLayout addressVAL;

    @NonNull
    public final Group badgesGroup;

    @NonNull
    public final HorizontalAtomsLayout badgesHAL;

    @NonNull
    public final VerticalAtomsLayout bannerInfoVal;

    @NonNull
    public final ConstraintLayout bannerLayout;

    @NonNull
    public final TextView collapse;

    @NonNull
    public final VerticalAtomsLayout controlsVAL;

    @NonNull
    public final ImageView coverImageIV;

    @NonNull
    public final RecyclerView deliveryConditionRv;

    @NonNull
    public final Barrier deliveryConditionsBarrier;

    @NonNull
    public final VerticalAtomsLayout deliveryConditionsVAL;

    @NonNull
    public final DisclaimerContainer disclaimer;

    @NonNull
    public final Barrier disclaimerBarrier;

    @NonNull
    public final TextAtom dueDateTA;

    @NonNull
    public final TextView headerBadgesTV;

    @NonNull
    public final VerticalAtomsLayout headerVAL;

    @NonNull
    public final TextAtom marketingInfoTA;

    @NonNull
    public final VerticalAtomsLayout metroVAL;

    @NonNull
    public final DisclaimerView newDisclaimerView;

    @NonNull
    public final TextAtomV2View numberPVZ;

    @NonNull
    public final FrameAtomsLayout photosFAL;

    @NonNull
    public final VerticalAtomsLayout placeDescriptionsVAL;

    @NonNull
    public final FrameAtomsLayout placeHeaderFAL;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ImageView scheduleIconIv;

    @NonNull
    public final RecyclerView scheduleRV;

    @NonNull
    public final VerticalAtomsLayout scheduleVAL;

    @NonNull
    public final Space topSpace;

    private WidgetAddressEditPickupDetailV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull RecyclerView recyclerView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull Group group, @NonNull HorizontalAtomsLayout horizontalAtomsLayout2, @NonNull VerticalAtomsLayout verticalAtomsLayout2, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull VerticalAtomsLayout verticalAtomsLayout3, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView2, @NonNull Barrier barrier2, @NonNull VerticalAtomsLayout verticalAtomsLayout4, @NonNull DisclaimerContainer disclaimerContainer, @NonNull Barrier barrier3, @NonNull TextAtom textAtom, @NonNull TextView textView2, @NonNull VerticalAtomsLayout verticalAtomsLayout5, @NonNull TextAtom textAtom2, @NonNull VerticalAtomsLayout verticalAtomsLayout6, @NonNull DisclaimerView disclaimerView, @NonNull TextAtomV2View textAtomV2View, @NonNull FrameAtomsLayout frameAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout7, @NonNull FrameAtomsLayout frameAtomsLayout2, @NonNull ImageView imageView2, @NonNull RecyclerView recyclerView3, @NonNull VerticalAtomsLayout verticalAtomsLayout8, @NonNull Space space) {
        this.rootView = constraintLayout;
        this.addressBarrier = barrier;
        this.addressNameChipsHAL = horizontalAtomsLayout;
        this.addressNameChipsHSV = horizontalScrollView;
        this.addressNameEt = textInputEditText;
        this.addressNameTil = textInputLayout;
        this.addressRv = recyclerView;
        this.addressVAL = verticalAtomsLayout;
        this.badgesGroup = group;
        this.badgesHAL = horizontalAtomsLayout2;
        this.bannerInfoVal = verticalAtomsLayout2;
        this.bannerLayout = constraintLayout2;
        this.collapse = textView;
        this.controlsVAL = verticalAtomsLayout3;
        this.coverImageIV = imageView;
        this.deliveryConditionRv = recyclerView2;
        this.deliveryConditionsBarrier = barrier2;
        this.deliveryConditionsVAL = verticalAtomsLayout4;
        this.disclaimer = disclaimerContainer;
        this.disclaimerBarrier = barrier3;
        this.dueDateTA = textAtom;
        this.headerBadgesTV = textView2;
        this.headerVAL = verticalAtomsLayout5;
        this.marketingInfoTA = textAtom2;
        this.metroVAL = verticalAtomsLayout6;
        this.newDisclaimerView = disclaimerView;
        this.numberPVZ = textAtomV2View;
        this.photosFAL = frameAtomsLayout;
        this.placeDescriptionsVAL = verticalAtomsLayout7;
        this.placeHeaderFAL = frameAtomsLayout2;
        this.scheduleIconIv = imageView2;
        this.scheduleRV = recyclerView3;
        this.scheduleVAL = verticalAtomsLayout8;
        this.topSpace = space;
    }

    @NonNull
    public static WidgetAddressEditPickupDetailV2Binding bind(@NonNull View view) {
        int i11 = R$id.addressBarrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.addressNameChipsHAL;
            HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
            if (horizontalAtomsLayout != null) {
                i11 = R$id.addressNameChipsHSV;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) C2548q.d(i11, view);
                if (horizontalScrollView != null) {
                    i11 = R$id.addressNameEt;
                    TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
                    if (textInputEditText != null) {
                        i11 = R$id.addressNameTil;
                        TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
                        if (textInputLayout != null) {
                            i11 = R$id.addressRv;
                            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                            if (recyclerView != null) {
                                i11 = R$id.addressVAL;
                                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                                if (verticalAtomsLayout != null) {
                                    i11 = R$id.badgesGroup;
                                    Group group = (Group) C2548q.d(i11, view);
                                    if (group != null) {
                                        i11 = R$id.badgesHAL;
                                        HorizontalAtomsLayout horizontalAtomsLayout2 = (HorizontalAtomsLayout) C2548q.d(i11, view);
                                        if (horizontalAtomsLayout2 != null) {
                                            i11 = R$id.bannerInfoVal;
                                            VerticalAtomsLayout verticalAtomsLayout2 = (VerticalAtomsLayout) C2548q.d(i11, view);
                                            if (verticalAtomsLayout2 != null) {
                                                i11 = R$id.bannerLayout;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                                                if (constraintLayout != null) {
                                                    i11 = R$id.collapse;
                                                    TextView textView = (TextView) C2548q.d(i11, view);
                                                    if (textView != null) {
                                                        i11 = R$id.controlsVAL;
                                                        VerticalAtomsLayout verticalAtomsLayout3 = (VerticalAtomsLayout) C2548q.d(i11, view);
                                                        if (verticalAtomsLayout3 != null) {
                                                            i11 = R$id.coverImageIV;
                                                            ImageView imageView = (ImageView) C2548q.d(i11, view);
                                                            if (imageView != null) {
                                                                i11 = R$id.deliveryConditionRv;
                                                                RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                                                                if (recyclerView2 != null) {
                                                                    i11 = R$id.deliveryConditionsBarrier;
                                                                    Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                                                                    if (barrier2 != null) {
                                                                        i11 = R$id.deliveryConditionsVAL;
                                                                        VerticalAtomsLayout verticalAtomsLayout4 = (VerticalAtomsLayout) C2548q.d(i11, view);
                                                                        if (verticalAtomsLayout4 != null) {
                                                                            i11 = R$id.disclaimer;
                                                                            DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
                                                                            if (disclaimerContainer != null) {
                                                                                i11 = R$id.disclaimerBarrier;
                                                                                Barrier barrier3 = (Barrier) C2548q.d(i11, view);
                                                                                if (barrier3 != null) {
                                                                                    i11 = R$id.dueDateTA;
                                                                                    TextAtom textAtom = (TextAtom) C2548q.d(i11, view);
                                                                                    if (textAtom != null) {
                                                                                        i11 = R$id.headerBadgesTV;
                                                                                        TextView textView2 = (TextView) C2548q.d(i11, view);
                                                                                        if (textView2 != null) {
                                                                                            i11 = R$id.headerVAL;
                                                                                            VerticalAtomsLayout verticalAtomsLayout5 = (VerticalAtomsLayout) C2548q.d(i11, view);
                                                                                            if (verticalAtomsLayout5 != null) {
                                                                                                i11 = R$id.marketingInfoTA;
                                                                                                TextAtom textAtom2 = (TextAtom) C2548q.d(i11, view);
                                                                                                if (textAtom2 != null) {
                                                                                                    i11 = R$id.metroVAL;
                                                                                                    VerticalAtomsLayout verticalAtomsLayout6 = (VerticalAtomsLayout) C2548q.d(i11, view);
                                                                                                    if (verticalAtomsLayout6 != null) {
                                                                                                        i11 = R$id.newDisclaimerView;
                                                                                                        DisclaimerView disclaimerView = (DisclaimerView) C2548q.d(i11, view);
                                                                                                        if (disclaimerView != null) {
                                                                                                            i11 = R$id.numberPVZ;
                                                                                                            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                                                                                            if (textAtomV2View != null) {
                                                                                                                i11 = R$id.photosFAL;
                                                                                                                FrameAtomsLayout frameAtomsLayout = (FrameAtomsLayout) C2548q.d(i11, view);
                                                                                                                if (frameAtomsLayout != null) {
                                                                                                                    i11 = R$id.placeDescriptionsVAL;
                                                                                                                    VerticalAtomsLayout verticalAtomsLayout7 = (VerticalAtomsLayout) C2548q.d(i11, view);
                                                                                                                    if (verticalAtomsLayout7 != null) {
                                                                                                                        i11 = R$id.placeHeaderFAL;
                                                                                                                        FrameAtomsLayout frameAtomsLayout2 = (FrameAtomsLayout) C2548q.d(i11, view);
                                                                                                                        if (frameAtomsLayout2 != null) {
                                                                                                                            i11 = R$id.scheduleIconIv;
                                                                                                                            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                                                                                                                            if (imageView2 != null) {
                                                                                                                                i11 = R$id.scheduleRV;
                                                                                                                                RecyclerView recyclerView3 = (RecyclerView) C2548q.d(i11, view);
                                                                                                                                if (recyclerView3 != null) {
                                                                                                                                    i11 = R$id.scheduleVAL;
                                                                                                                                    VerticalAtomsLayout verticalAtomsLayout8 = (VerticalAtomsLayout) C2548q.d(i11, view);
                                                                                                                                    if (verticalAtomsLayout8 != null) {
                                                                                                                                        i11 = R$id.topSpace;
                                                                                                                                        Space space = (Space) C2548q.d(i11, view);
                                                                                                                                        if (space != null) {
                                                                                                                                            return new WidgetAddressEditPickupDetailV2Binding((ConstraintLayout) view, barrier, horizontalAtomsLayout, horizontalScrollView, textInputEditText, textInputLayout, recyclerView, verticalAtomsLayout, group, horizontalAtomsLayout2, verticalAtomsLayout2, constraintLayout, textView, verticalAtomsLayout3, imageView, recyclerView2, barrier2, verticalAtomsLayout4, disclaimerContainer, barrier3, textAtom, textView2, verticalAtomsLayout5, textAtom2, verticalAtomsLayout6, disclaimerView, textAtomV2View, frameAtomsLayout, verticalAtomsLayout7, frameAtomsLayout2, imageView2, recyclerView3, verticalAtomsLayout8, space);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

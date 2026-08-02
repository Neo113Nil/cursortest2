package ru.ozon.fintech.features.camera.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.camera.ui.DocFrameView;
import ru.ozon.fintech.features.camera.ui.PhoneFrameView;
import ru.ozon.fintech.features.camera.ui.QrScannerView;
import ru.ozon.fintech.features.camera.ui.SelfieDocFrameView;
import ru.ozon.fintech.features.camera.ui.tips.TextTipsView;

/* loaded from: classes3.dex */
public final class CameraViewLayoutBinding implements a {

    @NonNull
    public final Guideline bottomGuideline;

    @NonNull
    public final ConstraintLayout cameraContainer;

    @NonNull
    public final PreviewView cameraView;

    @NonNull
    public final ImageButton captureButton;

    @NonNull
    public final DocFrameView documentFrame;

    @NonNull
    public final TextTipsView drumTextTips;

    @NonNull
    public final TextTipsView fadeTextTips;

    @NonNull
    public final ImageView ivChangeCamera;

    @NonNull
    public final ImageView ivCloseCamera;

    @NonNull
    public final ImageView ivCloseScan;

    @NonNull
    public final ImageView ivFlash;

    @NonNull
    public final ImageView ivGalleryScan;

    @NonNull
    public final PhoneFrameView phoneView;

    @NonNull
    public final TextView previewTitle;

    @NonNull
    public final Guideline qrFrameUpGuideline;

    @NonNull
    public final QrScannerView qrView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SelfieDocFrameView selfieDocumentFrame;

    @NonNull
    public final Guideline topGuideline;

    @NonNull
    public final TextView tvQrButton;

    private CameraViewLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout2, @NonNull PreviewView previewView, @NonNull ImageButton imageButton, @NonNull DocFrameView docFrameView, @NonNull TextTipsView textTipsView, @NonNull TextTipsView textTipsView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull PhoneFrameView phoneFrameView, @NonNull TextView textView, @NonNull Guideline guideline2, @NonNull QrScannerView qrScannerView, @NonNull SelfieDocFrameView selfieDocFrameView, @NonNull Guideline guideline3, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.bottomGuideline = guideline;
        this.cameraContainer = constraintLayout2;
        this.cameraView = previewView;
        this.captureButton = imageButton;
        this.documentFrame = docFrameView;
        this.drumTextTips = textTipsView;
        this.fadeTextTips = textTipsView2;
        this.ivChangeCamera = imageView;
        this.ivCloseCamera = imageView2;
        this.ivCloseScan = imageView3;
        this.ivFlash = imageView4;
        this.ivGalleryScan = imageView5;
        this.phoneView = phoneFrameView;
        this.previewTitle = textView;
        this.qrFrameUpGuideline = guideline2;
        this.qrView = qrScannerView;
        this.selfieDocumentFrame = selfieDocFrameView;
        this.topGuideline = guideline3;
        this.tvQrButton = textView2;
    }

    @NonNull
    public static CameraViewLayoutBinding bind(@NonNull View view) {
        int i11 = R.id.bottom_guideline;
        Guideline guideline = (Guideline) C2548q.d(R.id.bottom_guideline, view);
        if (guideline != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R.id.cameraView;
            PreviewView previewView = (PreviewView) C2548q.d(R.id.cameraView, view);
            if (previewView != null) {
                i11 = R.id.capture_button;
                ImageButton imageButton = (ImageButton) C2548q.d(R.id.capture_button, view);
                if (imageButton != null) {
                    i11 = R.id.document_frame;
                    DocFrameView docFrameView = (DocFrameView) C2548q.d(R.id.document_frame, view);
                    if (docFrameView != null) {
                        i11 = R.id.drum_text_tips;
                        TextTipsView textTipsView = (TextTipsView) C2548q.d(R.id.drum_text_tips, view);
                        if (textTipsView != null) {
                            i11 = R.id.fade_text_tips;
                            TextTipsView textTipsView2 = (TextTipsView) C2548q.d(R.id.fade_text_tips, view);
                            if (textTipsView2 != null) {
                                i11 = R.id.iv_change_camera;
                                ImageView imageView = (ImageView) C2548q.d(R.id.iv_change_camera, view);
                                if (imageView != null) {
                                    i11 = R.id.iv_close_camera;
                                    ImageView imageView2 = (ImageView) C2548q.d(R.id.iv_close_camera, view);
                                    if (imageView2 != null) {
                                        i11 = R.id.iv_close_scan;
                                        ImageView imageView3 = (ImageView) C2548q.d(R.id.iv_close_scan, view);
                                        if (imageView3 != null) {
                                            i11 = R.id.iv_flash;
                                            ImageView imageView4 = (ImageView) C2548q.d(R.id.iv_flash, view);
                                            if (imageView4 != null) {
                                                i11 = R.id.iv_gallery_scan;
                                                ImageView imageView5 = (ImageView) C2548q.d(R.id.iv_gallery_scan, view);
                                                if (imageView5 != null) {
                                                    i11 = R.id.phone_view;
                                                    PhoneFrameView phoneFrameView = (PhoneFrameView) C2548q.d(R.id.phone_view, view);
                                                    if (phoneFrameView != null) {
                                                        i11 = R.id.preview_title;
                                                        TextView textView = (TextView) C2548q.d(R.id.preview_title, view);
                                                        if (textView != null) {
                                                            i11 = R.id.qr_frame_up_guideline;
                                                            Guideline guideline2 = (Guideline) C2548q.d(R.id.qr_frame_up_guideline, view);
                                                            if (guideline2 != null) {
                                                                i11 = R.id.qr_view;
                                                                QrScannerView qrScannerView = (QrScannerView) C2548q.d(R.id.qr_view, view);
                                                                if (qrScannerView != null) {
                                                                    i11 = R.id.selfie_document_frame;
                                                                    SelfieDocFrameView selfieDocFrameView = (SelfieDocFrameView) C2548q.d(R.id.selfie_document_frame, view);
                                                                    if (selfieDocFrameView != null) {
                                                                        i11 = R.id.top_guideline;
                                                                        Guideline guideline3 = (Guideline) C2548q.d(R.id.top_guideline, view);
                                                                        if (guideline3 != null) {
                                                                            i11 = R.id.tv_qr_button;
                                                                            TextView textView2 = (TextView) C2548q.d(R.id.tv_qr_button, view);
                                                                            if (textView2 != null) {
                                                                                return new CameraViewLayoutBinding(constraintLayout, guideline, constraintLayout, previewView, imageButton, docFrameView, textTipsView, textTipsView2, imageView, imageView2, imageView3, imageView4, imageView5, phoneFrameView, textView, guideline2, qrScannerView, selfieDocFrameView, guideline3, textView2);
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

    @NonNull
    public static CameraViewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CameraViewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.camera_view_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

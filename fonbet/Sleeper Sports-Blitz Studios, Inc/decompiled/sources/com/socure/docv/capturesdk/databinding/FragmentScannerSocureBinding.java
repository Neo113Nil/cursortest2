package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.view.BrandLayout;
import com.socure.docv.capturesdk.common.view.CustomToolbar;
import com.socure.docv.capturesdk.common.view.GraphicOverlay;
import com.socure.docv.capturesdk.feature.scanner.presentation.ui.InfoLayout;
import com.socure.docv.capturesdk.feature.scanner.presentation.ui.OverlayLayout;
import com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerBottomLayout;
import com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerHelpGraphic;

/* loaded from: classes8.dex */
public final class FragmentScannerSocureBinding implements ViewBinding {
    public final View blockerView;
    public final BrandLayout brandView;
    public final BottomSheetViewBinding bsContainer;
    public final ScannerBottomLayout cblView;
    public final InfoLayout cilView;
    public final ConstraintLayout clProgressView;
    public final CustomToolbar clScannerToolbar;
    public final OverlayLayout docOverView;
    public final View extractionBlockerView;
    public final CircularProgressIndicator extractionProgressIndicator;
    public final Guideline glTop;
    public final GraphicOverlay graphicOverlay;
    public final VideoView imgPreview;
    public final AppCompatImageView ivDbgScanStages;
    public final PreviewView preview;
    private final CoordinatorLayout rootView;
    public final ScannerHelpGraphic scannerGraphic;
    public final ConstraintLayout viewLoader;

    private FragmentScannerSocureBinding(CoordinatorLayout coordinatorLayout, View view, BrandLayout brandLayout, BottomSheetViewBinding bottomSheetViewBinding, ScannerBottomLayout scannerBottomLayout, InfoLayout infoLayout, ConstraintLayout constraintLayout, CustomToolbar customToolbar, OverlayLayout overlayLayout, View view2, CircularProgressIndicator circularProgressIndicator, Guideline guideline, GraphicOverlay graphicOverlay, VideoView videoView, AppCompatImageView appCompatImageView, PreviewView previewView, ScannerHelpGraphic scannerHelpGraphic, ConstraintLayout constraintLayout2) {
        this.rootView = coordinatorLayout;
        this.blockerView = view;
        this.brandView = brandLayout;
        this.bsContainer = bottomSheetViewBinding;
        this.cblView = scannerBottomLayout;
        this.cilView = infoLayout;
        this.clProgressView = constraintLayout;
        this.clScannerToolbar = customToolbar;
        this.docOverView = overlayLayout;
        this.extractionBlockerView = view2;
        this.extractionProgressIndicator = circularProgressIndicator;
        this.glTop = guideline;
        this.graphicOverlay = graphicOverlay;
        this.imgPreview = videoView;
        this.ivDbgScanStages = appCompatImageView;
        this.preview = previewView;
        this.scannerGraphic = scannerHelpGraphic;
        this.viewLoader = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static FragmentScannerSocureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentScannerSocureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_scanner_socure, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentScannerSocureBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.blocker_view;
        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById3 != null) {
            i = R.id.brand_view;
            BrandLayout brandLayout = (BrandLayout) ViewBindings.findChildViewById(view, i);
            if (brandLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.bs_container))) != null) {
                BottomSheetViewBinding bind = BottomSheetViewBinding.bind(findChildViewById);
                i = R.id.cblView;
                ScannerBottomLayout scannerBottomLayout = (ScannerBottomLayout) ViewBindings.findChildViewById(view, i);
                if (scannerBottomLayout != null) {
                    i = R.id.cilView;
                    InfoLayout infoLayout = (InfoLayout) ViewBindings.findChildViewById(view, i);
                    if (infoLayout != null) {
                        i = R.id.cl_progress_view;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.clScannerToolbar;
                            CustomToolbar customToolbar = (CustomToolbar) ViewBindings.findChildViewById(view, i);
                            if (customToolbar != null) {
                                i = R.id.docOverView;
                                OverlayLayout overlayLayout = (OverlayLayout) ViewBindings.findChildViewById(view, i);
                                if (overlayLayout != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.extraction_blocker_view))) != null) {
                                    i = R.id.extraction_progress_indicator;
                                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
                                    if (circularProgressIndicator != null) {
                                        i = R.id.glTop;
                                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                        if (guideline != null) {
                                            i = R.id.graphicOverlay;
                                            GraphicOverlay graphicOverlay = (GraphicOverlay) ViewBindings.findChildViewById(view, i);
                                            if (graphicOverlay != null) {
                                                i = R.id.imgPreview;
                                                VideoView videoView = (VideoView) ViewBindings.findChildViewById(view, i);
                                                if (videoView != null) {
                                                    i = R.id.iv_dbg_scan_stages;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatImageView != null) {
                                                        i = R.id.preview;
                                                        PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i);
                                                        if (previewView != null) {
                                                            i = R.id.scannerGraphic;
                                                            ScannerHelpGraphic scannerHelpGraphic = (ScannerHelpGraphic) ViewBindings.findChildViewById(view, i);
                                                            if (scannerHelpGraphic != null) {
                                                                i = R.id.view_loader;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout2 != null) {
                                                                    return new FragmentScannerSocureBinding((CoordinatorLayout) view, findChildViewById3, brandLayout, bind, scannerBottomLayout, infoLayout, constraintLayout, customToolbar, overlayLayout, findChildViewById2, circularProgressIndicator, guideline, graphicOverlay, videoView, appCompatImageView, previewView, scannerHelpGraphic, constraintLayout2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

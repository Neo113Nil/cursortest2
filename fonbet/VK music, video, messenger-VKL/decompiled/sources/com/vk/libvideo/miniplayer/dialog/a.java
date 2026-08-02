package com.vk.libvideo.miniplayer.dialog;

import androidx.fragment.app.Fragment;
import com.vk.libvideo.miniplayer.dialog.VideoMinimizableDialogHeaderViewHolder;
import xsna.fxc0;
import xsna.wts0;
import xsna.z1h0;

/* compiled from: VideoMinimizableDialog.kt */
/* loaded from: classes3.dex */
public interface a {
    default VideoMinimizableDialogHeaderViewHolder.IconMode jh(Fragment fragment) {
        if (fxc0.B().J().h1()) {
            return VideoMinimizableDialogHeaderViewHolder.IconMode.Close;
        }
        wts0 vj = vj(fragment);
        return (vj != null ? vj.xf() : 0) > 1 ? VideoMinimizableDialogHeaderViewHolder.IconMode.Back : VideoMinimizableDialogHeaderViewHolder.IconMode.Close;
    }

    default wts0 k7(Fragment fragment) {
        z1h0 parentFragment = fragment.getParentFragment();
        if (parentFragment instanceof wts0) {
            return (wts0) parentFragment;
        }
        return null;
    }

    default wts0 vj(Fragment fragment) {
        z1h0 parentFragment = fragment.getParentFragment();
        if (parentFragment instanceof wts0) {
            return (wts0) parentFragment;
        }
        return null;
    }
}

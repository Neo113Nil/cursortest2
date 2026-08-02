package com.vk.im.ui.views.msg;

import android.widget.SeekBar;

/* compiled from: MsgPartAudioView.kt */
/* loaded from: classes2.dex */
public final class a implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ MsgPartAudioView b;

    public a(MsgPartAudioView msgPartAudioView) {
        this.b = msgPartAudioView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i = MsgPartAudioView.z;
        this.b.getClass();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        boolean isIndeterminate = seekBar.isIndeterminate();
        MsgPartAudioView msgPartAudioView = this.b;
        if (!isIndeterminate) {
            seekBar.getProgress();
            seekBar.getMax();
            int i = MsgPartAudioView.z;
            msgPartAudioView.getClass();
        }
        int i2 = MsgPartAudioView.z;
        msgPartAudioView.getClass();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }
}

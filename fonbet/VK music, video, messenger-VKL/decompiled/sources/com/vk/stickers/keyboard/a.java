package com.vk.stickers.keyboard;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import com.vk.stickers.keyboard.StickersView;

/* compiled from: BackspaceTouchListener.kt */
/* loaded from: classes6.dex */
public final class a implements View.OnTouchListener {
    public final StickersView.c b;
    public final HandlerC1794a c = new HandlerC1794a(Looper.getMainLooper());

    /* compiled from: BackspaceTouchListener.kt */
    /* renamed from: com.vk.stickers.keyboard.a$a, reason: collision with other inner class name */
    public static final class HandlerC1794a extends Handler {
        public HandlerC1794a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            a aVar = a.this;
            aVar.b.j();
            HandlerC1794a handlerC1794a = aVar.c;
            handlerC1794a.sendMessageDelayed(Message.obtain(handlerC1794a, 0), 70L);
        }
    }

    public a(StickersView.c cVar) {
        this.b = cVar;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        HandlerC1794a handlerC1794a = this.c;
        if (action != 0) {
            if (action == 1 || action == 3) {
                handlerC1794a.removeMessages(0);
                this.b.j();
                return true;
            }
            if (action != 5) {
                return true;
            }
        }
        handlerC1794a.sendMessageDelayed(Message.obtain(handlerC1794a, 0), 300L);
        return true;
    }
}

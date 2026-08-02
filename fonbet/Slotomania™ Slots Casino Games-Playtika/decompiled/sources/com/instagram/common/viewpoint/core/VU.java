package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class VU implements View.OnTouchListener {
    public static String[] A01 = {"BENQAquhgvj7TT9", "G4ABWHEO8pFoECzre8aPRkd5RqzaS810", "PI8RZp2k0CYdM", "EmvTCi8E1ni5QktN6f", "uKZwthLDSYADW2ME8E7na2CL49A5zEt8", "f3ahGFeoLQ7BDTppBYhbDWzCsZGogVaH", "wyETLpONaJd07JaZyOo", "wX7oH8VfboeBvBElZn"};
    public final /* synthetic */ C1179Vz A00;

    public VU(C1179Vz c1179Vz) {
        this.A00 = c1179Vz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C05506r c05506r;
        C05506r c05506r2;
        c05506r = this.A00.A07;
        if (c05506r != null) {
            int action = motionEvent.getAction();
            String[] strArr = A01;
            if (strArr[0].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[6] = "VIP8zqVOsYs7o10MZlA";
            if (action == 1) {
                c05506r2 = this.A00.A07;
                c05506r2.A0s();
            }
        }
        return true;
    }
}

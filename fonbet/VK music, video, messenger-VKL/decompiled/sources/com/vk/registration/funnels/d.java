package com.vk.registration.funnels;

import android.text.Editable;
import android.text.TextWatcher;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;

/* compiled from: TrackingTextWatcher.kt */
/* loaded from: classes5.dex */
public final class d implements TextWatcher {
    public final TrackingElement.Registration b;
    public final RegistrationElementsTracker c;
    public final SchemeStatSak$TypeRegistrationItem.EventType d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TrackingElement.Registration registration) {
        this(registration, null);
        RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 > 0 || i3 > 0) {
            this.c.a(this.b, this.d);
        }
    }

    public d(TrackingElement.Registration registration, SchemeStatSak$TypeRegistrationItem.EventType eventType) {
        RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
        this.b = registration;
        this.c = registrationElementsTracker;
        this.d = eventType;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

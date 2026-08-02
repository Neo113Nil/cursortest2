package L2;

import android.view.View;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class A {

    /* renamed from: b, reason: collision with root package name */
    public View f6757b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f6756a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6758c = new ArrayList();

    public A(View view) {
        this.f6757b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f6757b == a10.f6757b && this.f6756a.equals(a10.f6756a);
    }

    public int hashCode() {
        return (this.f6757b.hashCode() * 31) + this.f6756a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f6757b + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE) + "    values:";
        for (String str2 : this.f6756a.keySet()) {
            str = str + "    " + str2 + ": " + this.f6756a.get(str2) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        return str;
    }
}

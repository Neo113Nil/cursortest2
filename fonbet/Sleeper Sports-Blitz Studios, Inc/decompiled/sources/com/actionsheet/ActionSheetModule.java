package com.actionsheet;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class ActionSheetModule extends ReactContextBaseJavaModule {
    WritableMap response;

    public ActionSheetModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ActionSheetAndroid";
    }

    @ReactMethod
    public void showActionSheetWithOptions(ReadableMap readableMap, final Callback callback) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            WritableMap createMap = Arguments.createMap();
            this.response = createMap;
            createMap.putString("error", "can't find current Activity");
            callback.invoke(this.response);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (readableMap.hasKey("options")) {
            ReadableArray array = readableMap.getArray("options");
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(arrayList.size(), array.getString(i));
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(currentActivity, R.layout.dialog_item, arrayList);
        AlertDialog.Builder builder = new AlertDialog.Builder(currentActivity, R.style.DialogStyle);
        if (readableMap.hasKey("title") && readableMap.getString("title") != null && !readableMap.getString("title").isEmpty()) {
            builder.setTitle(readableMap.getString("title"));
        }
        builder.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() { // from class: com.actionsheet.ActionSheetModule.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                callback.invoke(Integer.valueOf(i2));
            }
        });
        AlertDialog create = builder.create();
        create.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.actionsheet.ActionSheetModule.2
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                dialogInterface.dismiss();
                callback.invoke(new Object[0]);
            }
        });
        create.show();
    }
}

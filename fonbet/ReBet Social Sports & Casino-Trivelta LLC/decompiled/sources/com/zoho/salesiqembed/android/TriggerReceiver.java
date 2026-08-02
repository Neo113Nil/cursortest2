package com.zoho.salesiqembed.android;

import Rf.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.zoho.livechat.android.modules.triggers.data.TriggersRepository;
import com.zoho.livechat.android.modules.triggers.domain.entities.TriggerAlarm;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import java.util.HashMap;
import java.util.Hashtable;
import ug.AbstractC6574b;

/* loaded from: classes4.dex */
public class TriggerReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public TriggersRepository f44632a = null;

    public final TriggersRepository a() {
        if (this.f44632a == null) {
            this.f44632a = TriggersRepository.y(MobilistenInitProvider.k());
        }
        return this.f44632a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            int intExtra = intent.getIntExtra("type", 0);
            String stringExtra = intent.getStringExtra("triggerid");
            Hashtable hashtable = new Hashtable();
            if (intExtra == 10) {
                hashtable.putAll((HashMap) intent.getSerializableExtra("triggerinfo"));
            } else {
                hashtable = (Hashtable) AbstractC6574b.d(intent.getStringExtra("triggerinfo"));
            }
            if (stringExtra != null) {
                hashtable.put("triggerid", stringExtra);
            }
            long longExtra = intent.getLongExtra("request_code", -1L);
            LiveChatUtil.log("TriggerReceiver: onReceive, " + longExtra);
            if (hashtable != null) {
                a from = a.from((String) hashtable.get("action_type"));
                String str = (String) hashtable.get("custom_action_name");
                if (longExtra != -1 && from != null) {
                    TriggerAlarm triggerAlarm = (TriggerAlarm) a().i(from, str, Long.valueOf(longExtra)).b();
                    if (triggerAlarm == null || triggerAlarm.getTime() == null || triggerAlarm.getTime().longValue() != longExtra) {
                        LiveChatUtil.log("TriggerReceiver: TriggerAlarm not found for actionType: " + from + ", customActionName: " + str);
                        return;
                    }
                    LiveChatUtil.log("TriggerReceiver: TriggerAlarm found for actionType: " + from + ", customActionName: " + str);
                    a().H(from, str);
                }
            }
            UTSUtil.executeTrigger(intExtra, intent.getBooleanExtra("has_custom_chat_id", false), hashtable);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }
}

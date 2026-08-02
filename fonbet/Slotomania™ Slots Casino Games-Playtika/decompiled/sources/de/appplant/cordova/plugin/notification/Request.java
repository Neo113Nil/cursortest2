package de.appplant.cordova.plugin.notification;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import de.appplant.cordova.plugin.notification.trigger.DateTrigger;
import de.appplant.cordova.plugin.notification.trigger.IntervalTrigger;
import de.appplant.cordova.plugin.notification.trigger.MatchTrigger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Request {
    public static final String EXTRA_LAST = "NOTIFICATION_LAST";
    static final String EXTRA_OCCURRENCE = "NOTIFICATION_OCCURRENCE";
    private final int count;
    private final Options options;
    private final JSONObject spec;
    private final DateTrigger trigger;
    private Date triggerDate;

    public Request(Options options) {
        this.options = options;
        JSONObject trigger = options.getTrigger();
        this.spec = trigger;
        this.count = Math.max(trigger.optInt("count"), 1);
        DateTrigger buildTrigger = buildTrigger();
        this.trigger = buildTrigger;
        this.triggerDate = buildTrigger.getNextTriggerDate(getBaseDate());
    }

    public Request(Options options, Date date) {
        this.options = options;
        JSONObject trigger = options.getTrigger();
        this.spec = trigger;
        this.count = Math.max(trigger.optInt("count"), 1);
        DateTrigger buildTrigger = buildTrigger();
        this.trigger = buildTrigger;
        this.triggerDate = buildTrigger.getNextTriggerDate(date);
    }

    public Options getOptions() {
        return this.options;
    }

    String getIdentifier() {
        return this.options.getId().toString() + "-" + getOccurrence();
    }

    int getOccurrence() {
        return this.trigger.getOccurrence();
    }

    private boolean hasNext() {
        return this.triggerDate != null && getOccurrence() <= this.count;
    }

    boolean moveNext() {
        if (hasNext()) {
            this.triggerDate = getNextTriggerDate();
        } else {
            this.triggerDate = null;
        }
        return this.triggerDate != null;
    }

    public Date getTriggerDate() {
        Calendar calendar = Calendar.getInstance();
        Date date = this.triggerDate;
        if (date == null) {
            return null;
        }
        long time = date.getTime();
        if (calendar.getTimeInMillis() - time <= 60000 && time < this.spec.optLong(TtmlNode.ANNOTATION_POSITION_BEFORE, 1 + time)) {
            return this.triggerDate;
        }
        return null;
    }

    private Date getNextTriggerDate() {
        return this.trigger.getNextTriggerDate(this.triggerDate);
    }

    private DateTrigger buildTrigger() {
        if (this.spec.opt("every") instanceof JSONObject) {
            return new MatchTrigger(getMatchingComponents(), getSpecialMatchingComponents());
        }
        return new IntervalTrigger(getTicks(), getUnit());
    }

    private DateTrigger.Unit getUnit() {
        String str;
        Object opt = this.spec.opt("every");
        if (this.spec.has("unit")) {
            str = this.spec.optString("unit", "second");
        } else if (!(opt instanceof String)) {
            str = "SECOND";
        } else {
            str = this.spec.optString("every", "second");
        }
        return DateTrigger.Unit.valueOf(str.toUpperCase());
    }

    private int getTicks() {
        Object opt = this.spec.opt("every");
        if (this.spec.has("at")) {
            return 0;
        }
        if (this.spec.has(ScarConstants.IN_SIGNAL_KEY)) {
            return this.spec.optInt(ScarConstants.IN_SIGNAL_KEY, 0);
        }
        if (opt instanceof String) {
            return 1;
        }
        if (opt instanceof JSONObject) {
            return 0;
        }
        return this.spec.optInt("every", 0);
    }

    private List<Integer> getMatchingComponents() {
        JSONObject optJSONObject = this.spec.optJSONObject("every");
        return Arrays.asList((Integer) optJSONObject.opt("minute"), (Integer) optJSONObject.opt("hour"), (Integer) optJSONObject.opt("day"), (Integer) optJSONObject.opt("month"), (Integer) optJSONObject.opt("year"));
    }

    private List<Integer> getSpecialMatchingComponents() {
        JSONObject optJSONObject = this.spec.optJSONObject("every");
        return Arrays.asList((Integer) optJSONObject.opt("weekday"), (Integer) optJSONObject.opt("weekdayOrdinal"), (Integer) optJSONObject.opt("weekOfMonth"), (Integer) optJSONObject.opt("quarter"));
    }

    private Date getBaseDate() {
        if (this.spec.has("at")) {
            return new Date(this.spec.optLong("at", 0L));
        }
        if (this.spec.has("firstAt")) {
            return new Date(this.spec.optLong("firstAt", 0L));
        }
        if (this.spec.has(TtmlNode.ANNOTATION_POSITION_AFTER)) {
            return new Date(this.spec.optLong(TtmlNode.ANNOTATION_POSITION_AFTER, 0L));
        }
        return new Date();
    }
}
